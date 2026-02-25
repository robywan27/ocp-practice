package chapter13;

import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        // if not in a try-with-resources block, the program will not terminate
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.execute(() -> System.out.println("Hello from a thread!")); // "Hello from a thread!" then hangs forever
        try (ExecutorService executor = Executors.newSingleThreadExecutor()) {
            executor.execute(() -> System.out.println("Hello from a thread!")); // Hello from a thread!
            Future<?> future = executor.submit(() -> System.out.println("Hello from a thread!")); // Hello from a thread!
            System.out.println(future.get()); // null
            System.out.println(future.isDone()); // false
            Future<String> futureWithType = executor.submit(() -> "Hello from a thread!");
            String s = futureWithType.get(10, TimeUnit.SECONDS);
            System.out.println(s); // Hello from a thread!
            System.out.println(future.isDone()); // true
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
