package chapter7.reviewexercises;

public class Primate {
    protected int age = 2;
     { age = 1; }
     public Primate() {
//        this();.age = 3;
    }
    public Primate(int age) {
//        this().age = 2; // doesn't compile, constructor call must be first statement
    }
}
