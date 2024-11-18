package chapter5.review;

import java.util.ArrayList;

import static java.util.Collections.*;
//import static java.util.Collections; // cannot import class
//import static java.util.Collections.sort(ArrayList<String>); // doesn't make sense

// exercise 15

public class Imports {
    public void method(ArrayList<String> list) {
        sort(list);
    }
}
