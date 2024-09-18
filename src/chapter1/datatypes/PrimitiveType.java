package chapter1.datatypes;

/*Primitive types.
 * There are 8 types. They store their value in memory where the variable is allocated.
 */
public class PrimitiveType {
    public static void main(String[] args) {
        boolean bool = true; // default value is false
        System.out.println(bool);

        char c = 'a'; // 16-bit Unicode value, same as short; can cast between them
        System.out.println(c);

        byte b = 124; // between -128 and 127
        System.out.println(b);

        short s = 12_345; // between -32,768 and 32,767
        System.out.println(s);

        /*Literal is a number in the code. By default, a literal is an int.
         * Writing a number larger than an int gives a compilation error. In that case, can add an L to cast it to long.
         * Note that a literal can have underscores to improve readability. Just not at the beginning, end,
         * before/after the decimal point
         * */
        int i = 1_234_567_890; // between -2,147,483,648 and 2,147,483,647
        System.out.println(i);

        // add an L or l to the literal. L is preferred
        long l = 12_345_678_900_000L; // between -2^63 and 2^63 - 1
        System.out.println(l);

        // add f to the literal
        float f = 1233.454f; // 32-bit floating point value
        System.out.println(f);

        double d = 12345.23; // 64-bit floating point value
        System.out.println(d);

        /*Other bases
        * */
        int octal = 047; // prefixed by  0
        System.out.println(octal);
        int hexadecimal = 0x23ADF; // prefixed by 0x/0X
        System.out.println(hexadecimal);
        int binary = 0b10101; // prefixed by 0b/0B
        System.out.println(binary);
    }
}
