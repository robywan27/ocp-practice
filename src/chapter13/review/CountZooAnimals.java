package chapter13.review;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CountZooAnimals {
    public static void performCount(int animal) {
        // implementation details
//        throw new RuntimeException(); // if uncommented then Exception! is printed 10 times
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.DAYS)); // can throw exception
        } catch (Exception e) {
            System.out.println("Exception!"); // if exception is thrown, this is printed
        }
    }

    public static void main(String[] args) throws Exception {
        final var r = new ArrayList<Future<?>>();
        try (var s = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 10; i++) {
                final int animal = i;
                r.add(s.submit(() -> performCount(animal)));
            }
            r.forEach(f -> printResults(f)); // null printed 10 times, but exception can be thrown
        }
    }
}
