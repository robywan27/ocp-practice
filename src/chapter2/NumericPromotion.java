package chapter2;

/*Numeric promotion rules:
*   1. if two values have two different types, Java automatically promotes one of the values to the larger of the two
*  data types
*   2. if one of the values is integral and the other is floating-point, the integral value is automatically promoted
*  to floating-point
*   3. smaller data types than int (byte, short, char) are promoted to int any time they are used with a binary
* arithmetic operator wit ha variable (as opposed to a value)
*   4. after promotion has occurred and all operands have the same data type, the result has the same type as its
* promoted operands
* */
public class NumericPromotion {
    public static void main(String[] args) {
        // 1.
        int x = 1;
        long y = 33;
        long z = x * y; // x promoted to long, z has type long

        // 2.
        int i = 2;
        float f = 2f;
        float fl = i + f; // i is promoted to float, fl has type float

        // 3.
        short a = 10;
        short b = 3;
        int c = a + b; // a and b are promoted to int, c has type int
//        short d = a + b; // invalid

        short sh = 3;
        short sh2 = sh++; // unary operators are excluded from rule 3.


        short p = 14;
        float q = 13; // note: this is a valid assignment! Can assign (int) literal to any type of numeric variable
        double r = 20; // note: this is a valid assignment! Can assign (int) literal to any type of numeric variable
        /*
            3. p is promoted to int
            2. p is promoted to float
            1. (p * q) result is promoted to double
            4. s has type double
         */
        double s = p * q / r;
    }
}
