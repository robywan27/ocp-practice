package chapter6;

public class BigCat {
    protected double size; // available in child classes
}

class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2; // size can be written to
    }
    public void printDetails() {
        System.out.println(size); // size can be read
    }
}

class Spider {
    public void printDetails() {
//        System.out.println(size); // not accessible
    }
}
