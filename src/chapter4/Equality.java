package chapter4;

import java.io.File;

/*
* == checks whether the references refer to the same object
* equals() if defined, uses logical equality instead of object equality. Default behavior is same as ==
* */
public class Equality {
    public static void main(String[] args) {
        var x = "Hello World";
        var z = "Hello World".trim();
        System.out.println(x.equals(z)); // true - String equals() checks values inside the String

        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a"); // StringBuilder returns the current reference
        System.out.println(one == two); // false - one and two are distinct objects
        System.out.println(one == three); // true - one and three point to the same object

        var name = "a";
        var surname = "b";
        var builder = new StringBuilder("a");
        var file = new File("");
//        System.out.println(name == builder); // does not compile. Classes have to be the same
//        System.out.println(name == file); // same
        System.out.println(name == surname); // compiles but always returns false in this case
    }
}
