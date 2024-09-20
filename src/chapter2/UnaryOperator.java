package chapter2;

/*Unary operator: requires exactly one operand*/
public class UnaryOperator {
    public static void main(String[] args) {
        /*Logical complement: !
        * Only valid with boolean values
        * */
        boolean isAnimalAsleep = false;
        System.out.println(!isAnimalAsleep); // true
//        int a = !3; // invalid
//        boolean boo = 0; // invalid - 0 is not equivalent to false

        /*Bitwise complement: ~
        * Inverts all 0s and 1s in a number
        * Tip: multiply the number by -1 then subtract 1
        * */
        int num = 7;
        System.out.println(~num); // (7 * -1) - 1 = -8

        /*Negation operator*/
        System.out.println(-num); // -7
        System.out.println(-(-num)); // 7; note the use of parentheses to distinguish from decrement operator --
        System.out.println(-(-(-num))); // -7; note the use of parentheses to distinguish from decrement operator --
//        boolean b = -true; // invalid

        /*Increment and decrement operator
        * pre-increment/decrement: ++a, --a
        *   increase/decreases the value by 1 and returns the new value
        * post-increment/decrement: a++, a--
        *   increase/decreases the value by 1 and returns the original value
        * */
        var a = 5;
        System.out.println(a++ + 3); // a = 8; a incremented but still 1 in this operation
        System.out.println(a); // a = 6
        System.out.println(--a); // a = 5; a decremented right away
    }
}
