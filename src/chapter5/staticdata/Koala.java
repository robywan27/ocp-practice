package chapter5.staticdata;

/*
* Static methods
* - utility or helper methods that don't require any object state
* - state that is shared by all instances of a class (e.g. counter). Methods that use that state should be static too
* */
public class Koala {
    public static int count = 0; // static variable

    public static void main(String[] args) { // static method
        System.out.println(count); // 0
    }
}
