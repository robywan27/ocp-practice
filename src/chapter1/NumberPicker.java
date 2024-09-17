package chapter1;

import java.util.Random; // import statement tells the compiler where to find the class Random
import java.util.*; // can use * wildcard to import all classes in package
/*
    Notes:
        - * doesn't import child packages, fields or methods!
        - importing all classes vs explicitly importing classes doesn't affect the performance of the program. The
        compiler is smart enough 🤓
*/

import java.nio.file.*;
/*
 Some cases of invalid import statements:
    import java.nio.*; // a wildcard only matches class names, not package names like file.Files
    import java.nio.*.*; // you can only have one wildcard, and it's at the end
    import java.nio.file.Files.*; // you can only import classes, not methods
*/

//import java.sql.*; // it creates ambiguity to the compiler if java.util.* is also present
/* Strategies to disambiguate:
        - explicitly import the class name:
            import java.util.Date;  <- this takes precedence over the wildcard
            import java.sql.*;
        - import one and use the fully qualified class name for the other:
            import java.util.Date;
            java.sql.Date date;
        - use both fully qualified class names:
            java.util.Date date;
            java.sql.Date sqlDate;
 */

public class NumberPicker {
    Date date;

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // note how we didn't needed to import System. That's because it's part of
        // the java.lang package. This package is automatically imported
        Animal a = new Animal(); // classes in the same package also don't need to be imported
    }

    public void read(Files files) {
        Paths.get("name");
    }
}
