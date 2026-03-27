package chapter7.polymorphism;

public class X {
    public static void doIt() {System.out.println("do");}

    public static void main(String[] args) {
        X x = new Y();
        x.doIt(); // do
        Y y = new Y();
        y.doIt(); // do it
    }
}

class Y extends X {
//    public void doIt() {System.out.println("do it");} // invalid override
    public static void doIt() {System.out.println("do it");}
}
