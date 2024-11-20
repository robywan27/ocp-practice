package chapter6;

public class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
    public void printData() {
        System.out.println(this.label); // buggy - label is defined in parent class, but given that it's visible to
        // child it
        // can be retrieved via this
        System.out.println(super.label); // buggy
        System.out.println(this.age); // 3
//        System.out.println(super.age); // can't find it in the superclass
        System.out.println(numberOfLegs); // 6
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
