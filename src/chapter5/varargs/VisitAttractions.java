package chapter5.varargs;

public class VisitAttractions {
    public static void walk1(int... steps) {
        System.out.println(steps.length); // treat param as an array
    }
    public static void walk2(int start, int... steps) {}
//    public void walk3(int... steps, int start) {} // varargs must be the last parameter
//    public void walk4(int... start, int... steps) {} // there can be at most one varargs param

    // calling methods with varargs
    public static void main(String[] args) {
        // pass an array
        int[] data = new int[]{1, 2, 3};
        walk1(data);

        // pass a list of values
        walk1(1, 2, 3, 4);

        // not passing values results in an array arg of length zero
        walk1();
    }
}
