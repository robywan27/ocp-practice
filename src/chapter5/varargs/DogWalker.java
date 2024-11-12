package chapter5.varargs;

public class DogWalker {
    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1); // 0
        walkDog(1, 2); // 1
        walkDog(1, 2, 3); // 2
        walkDog(1, new int[] {4, 5}); // 2
//        walkDog(1, null); // possible to pass null explicitly, but in this case it triggers a NullPointerException
        // because of .length call. In general better avoid using null
    }
}
