package chapter13;

public class ThreadTester {
    public static void main(String[] args) {
        var oldSchoolRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a thread!");
            }
        };
        Runnable runnable = () -> System.out.println("Hello from a thread!");

        Thread.Builder builder = Thread.ofPlatform();
        Thread.Builder.OfPlatform platformBuilder = Thread.ofPlatform();
        platformBuilder
            .priority(Thread.MIN_PRIORITY)
            .daemon(true);
        Thread.Builder.OfVirtual virtualBuilder = Thread.ofVirtual();

        platformBuilder.start(runnable); // Hello from a thread!
        virtualBuilder.start(runnable);
        virtualBuilder.start(runnable);
    }
}
