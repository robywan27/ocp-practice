package chapter3.loop;

/*
* while (booleanExpression) {  // termination condition as bool expression
*   body
* }
* Bool expr is evaluated before each iteration of the loop. Loop continues until expr is evaluated to false.
* */
public class WhileStatement {
    public static void eatCheese(int bitesOfCheese) {
        int roomInBelly = 5;

        while (bitesOfCheese > 0 && roomInBelly > 0) { // && so break from loop as soon as either evaluates to false
            bitesOfCheese--; // remember to decrement all counters being evaluated in the loop
            roomInBelly--; // also this one
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void main(String[] args) {
        eatCheese(2); // 0 pieces of cheese left
        eatCheese(7); // 2 pieces of cheese left

        int full = 5;
        while (full > 5) { // body is never evaluated because condition is evaluated first
            System.out.println("Not full");
            full++;
        }

        // watch out from infinite loops
        int pen = 2;
        int pigs = 5;
        while (pen < 10) // termination condition is never reached during runtime
            pigs++; // pen is never decremented
    }
}
