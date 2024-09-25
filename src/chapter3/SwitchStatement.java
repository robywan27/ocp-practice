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
        switch (day) {
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
            case 0, 1:
                System.out.println("Lion"); // comma-separated case values
            case 2:
                System.out.println("Giraffe"); // this is always called because there is no break in the previous
                // case statement
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(5); // Friday
        printDayOfTheWeek(10); // Invalid day
        pickAnimal(1); // prints Lion and Giraffe
        pickAnimal(2); // Giraffe
        pickAnimal(3); // prints nothing

        /*Valid data types
        * int, Integer
        * byte, Byte
        * short, Short
        * char, Character
        * String
        * enum values
        * var, if the type resolves to any one of the previous mentioned types
        * */
        short sh = 12;
        switch (sh) {};
        char ch = 'q';
        switch (ch) {};
        switch ("str") {};
        var variable = "A variable var of valid type";
        switch (variable) {};

        enum DayOfTheWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };
        DayOfTheWeek day = DayOfTheWeek.WEDNESDAY;
        switch (day) {
            case MONDAY: System.out.println("Monday"); break;
            case TUESDAY: System.out.println("Tuesday"); break;
            case WEDNESDAY: System.out.println("Wednesday"); break;
            case THURSDAY: System.out.println("Thursday"); break;
            case FRIDAY: System.out.println("Friday"); break;
            case SATURDAY: System.out.println("Saturday"); break;
            case SUNDAY: System.out.println("Sunday"); break;
        }

        // invalid
        long longVal = 10L;
//        switch (longVal) {} // long values are not valid
        float flNum = 3.4f;
//        switch (flNum) {};
        boolean bool = true;
//        switch (bool) {};
    }

    /*Valid case values
     * Must be compile-time constant values of the same data type as the switch value.
     * - literals
     * - enum constants
     * - final constant variables of the same data type; must be initialized with a literal value at declaration
     * */
    final int getCookies() { return 4; }
    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
//            case apples:  // not constant
//            case getCookies(): // methods are evaluated at runtime
//            case cookies: // same, even with final variable
            case 1 + 2: // expressions are allowed
        }
    }
}