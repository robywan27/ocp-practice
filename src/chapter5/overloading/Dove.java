package chapter5.overloading;

// calling overloaded methods is easy, Java just picks the right one
public class Dove {
    public void fly(int numMiles) {
        System.out.println("int");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }

    public static void main(String[] args) {
        Dove dove = new Dove();
        dove.fly((short) 1); // short
    }
}
