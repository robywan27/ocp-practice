package chapter3.loop;

/*
* for (initialization; boolExpr; updateStatement) {
*   body
* }
*
* 1. initialization statement executes
* 2. if boolExpr is true, continue; else exit loop
* 3. body executes
* 4. update statement executes
* 5. return to step 2.
*
* Like while statement, the bool expr is evaluated on every iteration before the loop executes
* */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
//        System.out.println(i); // variables declared in the init block are accessible only within for loop

        int i; // can declare the variable before the loop
        for (i = 0; i < 10; i++) // i is not declared, just initialized
            System.out.println("Value is:" + i);
        System.out.println(i); // i is accessible outside the loop

        // loop in reverse order
        for (var counter = 5; counter >= 0; counter--)
            System.out.println(counter);

        // infinite loop
//        for ( ; ; )
//            System.out.println("Infinite");

        // add multiple terms to the for statement
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++)
            System.out.println(y + " ");
        System.out.println(x + " "); // 0 1 2 3 4

        /*
        Invalid stuff
         */
        // re-declaring a variable in the init block
        int a = 0;
//        for (int a = 3; a > 0; a--)
//            System.out.println(a + " ");

        // using incompatible types in the init block
//        for (long b = 0, int c = 4; a < 5 && b < 10; a++, b++) // notice long and int in init block
//            System.out.println(b + " ");

        // using loop variables outside the loop
        for (int j = 0; j < 5; j++)
            System.out.println(j + " ");
//        System.out.println(j);

        // each component in a for loop is optional
        int it = 0;
        for(; it < 10; it++) System.out.print(it);
//        for(int it2 = 0; ; it++) System.out.print(it);
//        for (int it3 = 0; it3 < 10; ) System.out.print(it3 + " ");
        int jj = 0;
//        for(; ; jj++) System.out.print(jj + " ");
        // ... and so on

        // any data type is permitted
        System.out.println();
        for (double d = 0; d < 4; d++) System.out.println(d);
        for (boolean b = false; !b; b = true) System.out.println(b);
        for(String s = ""; s.length() < 10; s += "0") System.out.println(s);
        class Dolphin {}
        Dolphin dolphin2 = new Dolphin();
        for (Dolphin dolphin1 = new Dolphin(); dolphin1 != dolphin2; dolphin1 = dolphin2) {}
    }
}
