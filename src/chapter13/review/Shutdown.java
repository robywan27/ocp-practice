package chapter13.review;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Shutdown {
    private static void takeNap() {
        LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(5)); // wait 5 seconds; this implementation doesn't throw an exception
    }

    public static void shutdown() throws InterruptedException {
        var service = Executors.newFixedThreadPool(4);
        try {
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        }
        finally {
            service.shutdown();
        }
        service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("DONE!");
    }

    public static void refactored() {
        try (var service = Executors.newFixedThreadPool(4)) {
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        }
        System.out.println("DONE!");
    }

    public static void main(String[] args) throws InterruptedException {
        shutdown(); // waits for 2 seconds
        refactored(); // waits for 5 seconds
    }
}
