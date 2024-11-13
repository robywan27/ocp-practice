package chapter5.staticdata;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height; // final variable not initialized

    static { bamboo = 5; } // static initializer to initialize static variable
}
