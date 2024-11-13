package chapter5.staticdata;

// Common use case for static variables is counting the number of instances
public class Counter {
    private static int count;
    public Counter() { count++; }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
    }
}
