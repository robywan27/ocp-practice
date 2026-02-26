package chapter13.review;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class MaybeDeadlock {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Object o1 = new Object();
        Object o2 = new Object();

        try (var service = Executors.newFixedThreadPool(2)) {
            var f1 = service.submit(() -> {
                synchronized (o1) {
                    synchronized (o2) { System.out.println("Tortoise"); } // may be printed or may result in deadlock
                }
            });
            var f2 = service.submit(() -> {
                synchronized (o2) {
                    synchronized (o1) { System.out.println("Hare"); } // may be printed or may result in deadlock
                }
            });
            f1.get();
            f2.get();
        }
    }
}
