package chapter2;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 50; // assignment
        /*
        * smaller data types are automatically promoted to larger ones
        * but trying to assign larger data types to smaller types result in compiler error (without casting)
        * */
        long l = 13;
//        int i = 12L; // invalid

        /*Casting
        * unary operator
        * Necessary when converting to a smaller/narrowing type, but optional the other way around.
        * Also necessary to convert a floating-point number to an integral number.
        * With numeric values, it changes the data type. With reference types, it changes the reference to the object
        * */
        int val = (int) 15L;
        int integer = (int) 35.0;

        short a = 10;
        short b = 3;
        short c = (short) (a + b); // operator casts a and b to int, so need to cast to short. Remember to
        // use parentheses to cast both!

        /*
        * No casting needed when working with literal values that fit into the data type (remember promotion rule 3.).
        * With variables, the compiler reports an error because there is ambiguity
        * */
        byte by = 12;
        short ss = 1300;
        //        short bird = 122345; // invalid - int literal is outside range for short
        short sh = (short) 1223456;
//        short boo = by + 3; // invalid - by is a variable so both operands are cast to int


        /*Compound assignment operators: +=, -=, *=, /=
        * Important: automatically cast the result to the data type of the value to the left of the compound operator.
        * The operators can only be applied with a variable tha was already defined and cannot declare a new variable
        * */
        int camel = 3, zebra = 2;
        camel *= zebra;

        long goat = 1;
        int sheep = 5;
        sheep *= goat; // sheep is promoted to long, but then sheep is automatically cast to int
//        sheep = sheep * goat; // invalid because of promotion rule 4.

        // assignment operator returns the value of the assignment
        boolean check = false;
        if (check = true) // check is assigned value true and its value (true) is returned
            System.out.println("printed"); // printed
    }
}
