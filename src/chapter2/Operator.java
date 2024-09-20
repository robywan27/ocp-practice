package chapter2;

public class Operator {
    public static void main(String[] args) {
        /*Operators: symbol applied to value, variables, literals
        * In this example:
        *   operators: +, =
        *       type: binary operators
        *       operator precedence: + then =
        *   operands: 1, 4
        *   result = var x
        * */
        var x = 1 + 4;
        int a = 1;
        int b = 2;
        int c = a + b;
        x++; // unary operator
        int boo = x == c ? a : b; // ternary operator

        /*Order of precedence*/
        var perimeter = a * 2 + b * 3; // first * then +
        var perimeter2 = a * (2 + b) * 3; // parentheses change order of precedence
    }
}
