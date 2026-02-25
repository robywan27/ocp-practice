package chapter13;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledExecutor {
    public static void main(String[] args) {
        try (ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor()) {
            executor.schedule(() -> System.out.println("Hello from a thread!"), 2, java.util.concurrent.TimeUnit.SECONDS); // Hello from a thread! (after 2 seconds)
            executor.scheduleAtFixedRate(() -> System.out.println("Hello repeated at fixed rate!"), 3, 2, java.util.concurrent.TimeUnit.SECONDS); // Hello from a thread! (after 3 seconds, then every 2 seconds)
            executor.scheduleWithFixedDelay(() -> System.out.println("Hello repeated with fixed delay!"), 4, 2, java.util.concurrent.TimeUnit.SECONDS); // Hello from a thread! (after 4 seconds, then every 2 seconds after the previous task finishes)
            Thread.sleep(10000); // sleep for 10 seconds to allow scheduled tasks to execute
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }
}
