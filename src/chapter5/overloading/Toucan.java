package chapter5.overloading;

public class Toucan {
//    public void fly(int[] lengths) {}
    public void fly(int... lengths) {} // varargs are treated as if they were arrays -> same signatures

    public static void main(String[] args) {
        var t = new Toucan();
        t.fly(new int[] {1, 2, 3});
        t.fly(1, 2, 3); // this is only possible to call with method that expects a varargs param
    }
}
