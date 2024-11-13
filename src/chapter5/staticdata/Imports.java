package chapter5.staticdata;

import java.util.List;
//import java.util.Arrays;
import static java.util.Arrays.asList; // static import

/*
* Regular imports are for importing classes
* Static imports are for importing static members (variables and methods) of a class
* Mostly used to refer to many constants in another class. But use sparingly in large programs
* */
public class Imports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // no Arrays. prefix needed here
    }

//    private void asList() {} // if you name a method in class with same name as static imported method, the one in
    // the class takes precedence
}
