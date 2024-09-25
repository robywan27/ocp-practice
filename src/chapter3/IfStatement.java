package chapter3;

/*If statement
* Allows to the program to execute a certain code of block if and only if a boolean expression evaluates to true at
* runtime
* */
public class IfStatement {
    public static void main(String[] args) {
        int balls = 2;
        if (balls > 1) { // wrapping in code block is optional for one statement (but stylistically recommended)
            System.out.println("Printed");
        }
        if (balls > 1) System.out.println("Printed"); // can inline statement

        int hourOfDay = 5;
        int greetingsCount = 0;
        if (hourOfDay < 12)
            System.out.println("Good morning");
            greetingsCount++; // this is always going to be executed

        if (hourOfDay < 12) System.out.println("Good morning");
        else if (hourOfDay < 18) System.out.println("Good afternoon");
        else System.out.println("Good evening");

        int hour = 1;
//        if (hour) System.out.println(hour); // hour is not boolean; 0 and 1 are not considered boolean values
    }
}
