package chapter4;

/* String pool
* location in the JVM that collects all strings that can be re-used in the program: compile-time literal values and constants
* */
public class StringPool {
    public static void main(String[] args) {
        // "name" - literal -> string pool
        // myObject.toString() - not a literal -> not in the string pool

        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y); // true - "Hello World" is a literal and is stored in the pool, so x and y point
        // to the same location in memory

        System.out.println(x == y.toString()); // true

        var z = " Hello World".trim();
        System.out.println(x == z); // false - String z is computed at runtime, therefore a new String object is created
        System.out.println(x.equals(z)); // true
        var w = "Hello World".trim();
        System.out.println(x == w); // true - trim() doesn't modify the content of the String so w points to the same
        // literal in the pool
        var v = " Hello World";
        System.out.println(z == v); // false because trim() modifies the content of v producing a new String

        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat); // false - += is a method call, so it results in a new String
        var notConcat = "hello " + "world";
        System.out.println(singleString == notConcat); // true - concat without assignment is not a method call

        var hello = "Hello World";
        var helloNew = new String("Hello World");
        System.out.println(hello == helloNew); // false - new String() specifically instructs the compiler to create
        // a new String!

        // intern() - instructs the compiler to use the string pool. If a literal is not there yet, it is added
        System.out.println(hello == helloNew.intern()); // true - second string is interned in the pool, so both are
        // referencing to the same literal in the pool

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); // true - both compile-time constants
        System.out.println(first == second.intern()); // true
        System.out.println(first == third); // false
        System.out.println(first == third.intern()); // true
    }
}
