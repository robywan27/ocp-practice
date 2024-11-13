package chapter5.overloading;

// Java picks the most specific version of a method it can find - reference types case
public class Pelican {
    public void fly(String s) {
        System.out.println("string");
    }
    public void fly(Object o) {
        System.out.println("object");
    }

    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("test"); // string
        System.out.println("-");
        p.fly(56); // object
    }
}
