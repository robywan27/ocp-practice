package chapter2.comparison;

import java.io.File;

/*Equality operator: ==, !=
*   - primitive types: true if the two values represent the same/different value
*   - reference types: true if the two values reference/don't reference the same object
* Cannot mix the types of the operands
* */
public class EqualityOperator {
    public static void main(String[] args) {
        int a = 3, b = 2;
        var f = a == b;
        var t = a != b;
//        boolean monkey = true == 3; // can't compare boolean with int

        boolean bear = false;
        boolean polar = (bear = true); // this is not an equality operator but assignment
        System.out.println(polar); // true

        /*
        Reference types
         */
        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true

        System.out.println(null == null); // always true
        System.out.println(null != null); // false
        System.out.println(monday == null); // always false
    }
}
