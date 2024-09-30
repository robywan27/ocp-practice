package chapter3;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewExercises {
    /* exercise 3
    on the right side of a for-each expression, all arrays are allowed
        this includes arrays of characters. They are not exactly equivalent to String, which does not implement the
        Collection interface. For this reason Strings are not allowed on the right side of for-each loops
    Set, as well as List, implement java.lang.Iterable, so they are allowed on the right side. Map doesn't instead
     */


    /*exercise 7* */
    private static void print(int[] weather) {
//        for (int i = 0, int j = 3; i < weather.length; ++i) { // type declaration has to be listed only once
        for (int i = 0, j = 3; i < weather.length; ++i) { // this is correct
            System.out.println(weather[i]);
        }
        System.out.println();
        for (int i = 0; ++i < 10 && i < weather.length; ) { // this compiles! update statement is executed in
            // termination condition itself.
            // does not print all elements of weather because i is incremented in boolean expr
            System.out.println(weather[i]);
        }
    }


    /*exercise 10* */
    private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay) {
            default: // valid
//            case 1: continue; // continue not admitted in switch statement
//            case thursday: return DayOfWeek.THURSDAY; // thursday has to be initialized to a constant value, so
//            doesn't matter that it's declared final
            case 2, 10: break;
//            case Sunday: return DayOfWeek.SUNDAY; // Sunday is not final
//            case DayOfWeek.MONDAY: return DayOfWeek.MONDAY; // case values has to be of the same type, here int
            case 1: return DayOfWeek.TUESDAY; // return is valid here as long as its type is the same as that of the
        // return type for the method
        }
        return DayOfWeek.FRIDAY;
    }


    /*exercise 17*/
    private static void countAttendees() {
        int performers = -1;
        for ( ; performers < 2; performers += 2) {} // this is valid syntax! Initialization happens outside the for
        System.out.println(performers);
    }


    /*exercise 21*/
    void findZookeeper(Long id) {
//        System.out.print(switch (id) { // long is not admitted in switch
        System.out.print(switch (5) {
//            case 10 -> {"Jane"}
//            case 20 -> {yield "Lisa";};
            case 30 -> "Kelly";
//            case 30 -> "Sarah";
            default -> "Unassigned";
        });
    }


    /*exercise 28*/
    static void getFish(Object fish) {
        if (!(fish instanceof String guppy)) // guppy is in scope after if branch if type is not a String. Because of
            // negation of condition, guppy remains valid also in other branches
            System.out.println("Eat!");
//        else if (!(fish instanceof String guppy)) { // variable is a duplicate of previous one
        else if (!(fish instanceof Integer sara)) {
            System.out.println("Drink!");
        }
//        System.out.println("Swim!");

        // another example not in exercise
        if (fish instanceof String guppy) // without negation here, defining guppy in another branch is not
            // considered a duplicate of the variable
            System.out.println("Eat!");
        else if (fish instanceof String guppy)
            System.out.println("Drink!");
        }


    public static void main(String[] args) {
        /* exercise 5*/
        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for (var a : myFavoriteNumbers) { // var is allowed in for-each loops
            System.out.println(a + ", ");
            break;
        }

        for (int b : myFavoriteNumbers) {
            continue;
//            System.out.println(b + ", "); // unreachable
        }

        for (Object c : myFavoriteNumbers) // Object is a valid type here because it's the most generic type in Java
            System.out.println(c + ", ");
        Object object = Arrays.asList("I", "am", "a", "list"); // valid assignment. However object doesn't have
        // access to List methods


        // exercise 7
        int[] weather = new int[]{1, 4, 7, 3, 8};
        print(weather);


        /*exercise 13
        * Be careful with syntax!
        * */
        boolean keepGoing = true;
        do {
            // ...
//        } while keepGoing; // boolean expression is missing parentheses
        } while (false);


        /*exercise 14*/
        for (var penguin : new int[2])
            System.out.println(penguin); // null
        var ostrich = new Character[3];
        for (var emu : ostrich) // array of chars is valid to iterate
            System.out.println(emu); // null
        List<Integer> parrots = new ArrayList<Integer>();
        for (var macaw : parrots)
            System.out.println(macaw); // null


        /*exercise 16*/
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--) // valid; note that j is irrelevant in the loop
            System.out.println(wolf[x]);


        // exercise 17
        countAttendees(); // 3
        // some other contrived example not in exercise
        int count = 0;
        for ( ; count < 5; ) { // this is valid, as long as initialization and update happen. In this form the for is
            // more similar to a while
            count++;
        }


        /*exercise 18
        * Flow scoping means a pattern variable is only accessible if the compiler can discern its type <- valid
        * */


        /*exercise 19
        * careful when checking if code compiles, e.g. variable scopes
        * */
        double iguana = 0;
        do {
            int snake = 1;
//            System.out.println(snake++ + " ");
            iguana--;
//        } while (snake <= 5); // snake is out of scope
        } while (false);
//        System.out.println(iguana);


        /*exercise 20
        * tip: look for solutions that do not get you out of the inner infinite loop and discard them
        * */
        int height = 1;
        L1: while (height++ < 10) {
            long humidity = 12;
            L2: do {
                    if (humidity-- % 12 == 0) break L2; // or continue L2
                    int temperature = 30;
                    L3: for ( ; ; ) {
                            temperature++;
                            if (temperature > 50) continue L2; // or continue L2
                    }
            } while (humidity > 4);
        }

        // unrelated
        if (true) ; // note that this compiles!


        /*exercise 25*/
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;
        switch (instrument) {
            case "bass": break;
            case CELLO: p++;
            default: p++; // no break here, which means that next branches are going to be executed even if condition
                // isn't true. To avoid this, either add break here, or move default branch to the bottom of the switch
            case "VIOLIN": p++;
            case "viola": ++p; break;
        }
        System.out.print(p); // 2


        // exercise 28
        getFish("goldie");


        /*exercise 29*/
        int y = -2;
        do System.out.print(++y + " ");
        while (y <= 5); // -1 to 6
    }
}
