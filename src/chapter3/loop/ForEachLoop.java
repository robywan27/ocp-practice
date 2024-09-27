package chapter3.loop;

import java.util.Arrays;
import java.util.List;

/*
* for (datatype instance : collection) { // initialization - object to iterate
*   body
* }
*
* Right side of the for-each loop:
*  - arrays
*  - classes from the Collections Framework that: implement java.lang.Iterable and implement/extend the Collection
* interface
*
* Left side of the for-each loop: declaration for an instance of a variable whose type is compatible with the type of
*  the array/collection on the right side.
* On each iteration, the named variable is assigned a new value from the array/collection
* */
public class ForEachLoop {
    public static void printNames(String[] names) { // input is array of String
        for (var name: names) // name is of type String
            System.out.println(name);
    }

    // same method with basic for loop
    public static void printNamesWithFor(String[] names) {
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
    }

    public static void printNames(List<String> names) { // List is also valid
        for (var name: names)
            System.out.println(name);
    }

    public static void main(String[] args) {
        String[] names = {"casa", "bella", "halo", "house"};
        List<String> listOfNames = Arrays.asList("I", "am", "a", "list");
        printNames(names);
        printNamesWithFor(names);
        printNames(listOfNames);

        // String can't be used on the right side
        String birds = "Jay";
//        for (bird : birds)
//            System.out.println(bird);

        // left side type does not match expected String type
//        for (int name : names)
//            System.out.println(name);
    }
}
