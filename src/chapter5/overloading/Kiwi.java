package chapter5.overloading;

// With autoboxing, Java still tries to use the most specific parameter list it can find
public class Kiwi {
    public void fly(int numMiles) {
        System.out.println("int");
    }
    public void fly(Integer numMiles) {
        System.out.println("Integer");
    }

    // with arrays autoboxing doesn't occur. Arrays specify their actual types
    public static void walk(int[] ints) {
        System.out.println("ints");
    }
    public static void walk(Integer[] integers) {
        System.out.println("integers");
    }

    public static void main(String[] args) {
        var k = new Kiwi();
        int i = 3;
        k.fly(i); // int
        Integer integer = Integer.valueOf(i);
        k.fly(integer); // Integer
        k.fly(integer.intValue()); // int

        // with arrays
        int[] numbers = {1, 2, 3};
        walk(numbers); // ints
        Integer[] integerNumbers = {1, 2, 3};
        walk(integerNumbers); // integers
    }
}
