package chapter1.packageb;

import chapter1.packagea.ClassA; // need to import ClassA because it belongs in a different package: packagea

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("heyo");
    }
}
