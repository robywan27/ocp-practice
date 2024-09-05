package chapter1;

//public class Animal {} // incorrect: there can only be one public class per file

public class Zoo { // even with main method this class doesn't have to be public
    // parameters can be assigned any other name other than args
    // public and static are mandatory; but it's possible to add other keywords, like final
    /* There are multiple valid ways to define an array
        * String[] args
        * String args[]
        * String... args
     */
    public static void main(String[] arguments) {
//        System.out.println("Ciaone");
        System.out.println(arguments[0]);
        System.out.println(arguments[1]);
    }
}