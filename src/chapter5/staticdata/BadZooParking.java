package chapter5.staticdata;


//import static java.util.Arrays; // use regular import here to import class

import java.util.Arrays;

import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // static and import order is swapped

public class BadZooParking {
    public static void main(String[] args) {
        Arrays.asList("one"); // if Arrays is not imported, this doesn't compile!
    }
}
