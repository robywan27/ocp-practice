package chapter3;

/*Switch statement
* Decision-making structure in which a single value is evaluated and flow is redirected to the first matching branch:
*  case statement.
* Can add an optional default statement in case there is no match with any of the other case statements.
* If default branch is not there, the switch statement is skipped.
* case values can be combined into a single case statement using commas
* */
public class SwitchStatement {
    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break; // optional
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default: // optional, can appear anywhere in the switch statement
                System.out.println("Invalid day");
                break;
        }
    }

    public static void pickAnimal(int animal) {
        switch (animal) {
            case 0, 1: System.out.println("Lion"); // comma-separated case values
            case 2: System.out.println("Giraffe"); // this is always called because there is no break in the previous
                // case statement
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(5); // Friday
        printDayOfTheWeek(10); // Invalid day
        pickAnimal(1); // prints Lion and Giraffe
        pickAnimal(2); // Giraffe
        pickAnimal(3); // prints nothing
    }
}
