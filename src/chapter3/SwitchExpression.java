package chapter3;

/*Switch expression
* Compact form of switch statement. It can return a value, which can be assigned to a variable.
* All case and default branches must return a type compatible with the assignment.
* Two types of branches supported:
*   - an expression
*   - a block
* */
public class SwitchExpression {
    public void printDayOfTheWeek(int day) {
        var result = switch (day) {
            case 0 -> "Saunday"; // arrow operator -> instead of colon :, case branch ain't a lambda expression though!
            case 1 -> { yield "Monday"; } // if case block, yield is required when returning a value
            case 2 -> "Tuesday"; // semicolon required
            case 3 -> "Wednesday"; // no break statement required
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day"; // default is required, if all case values aren't handled
        }; // semicolon required here too, because of assignment
        System.out.println(result);
    }

    public void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Fall");
        } // this is a switch statement; in this case semicolon is not required because no value is returned
    }

    public static void main(String[] args) {
        var bear = 1;
        var result = switch (bear) {
//            case 3 -> "Grizzly" // semicolon required
            case 3 -> "Grizzly";
            default -> "Panda";
//        } // semicolon required
        };

        /*Rules for switch expressions
         * 1. all the branches that don't throw an exception must return a consistent data type, if the switch
         * expression returns a value
         * 2. if switch expr returns a value, then every branch that isn't an expression (case blocks) must yield a value
         * 3. a default branch is mandatory unless all cases are covered or no value is returned
         * */

        // Rule 1.
        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> 1;
            case 10 -> (short) 2;
            default -> 5;
//            case 20 -> "ciao";
//            case 40 -> 4L;
//            case 33 -> null;
        };

        // Rule 2.
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> { yield "Trout"; }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green"; // else is mandatory, all branches must yield a value within the case block
            }//; no semicolons at the end of blocks
            default -> "Swordfish";
        };

        // Rule 3.
        int canis = 1;
        String type = switch (canis) {
            case 1 -> "dog";
            case 2 -> "wolf";
            case 3 -> "coyote";
            default -> "cat"; // required! or won't compile
        };

        enum Season { WINTER, SPRING, SUMMER, FALL}
        Season season = Season.WINTER;
        var s = switch (season) {
            case WINTER -> "Winter";
            case SPRING -> "Spring";
            case SUMMER -> "Summer";
            case FALL -> "Fall";
            // default is not needed here because all enum values have been covered
        };
        // Tip: add default always, also with enums, because in the future one can add a new value and code won't
        // compile anymore
    }
}
