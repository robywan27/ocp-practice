package chapter5.review;

public class ReviewExercises {
    /*
    * Exercise 1.
    * D. local variables CAN be declared with type var and final modifier
    * */
    void test() {
        final var abc = "abc"; // final var has to be initialized at declaration, then type can be inferred
//        final var abc; // needs to be initialized
//        final String abc; // same
    }


    // exercise 6 - be very careful at syntax!
//    public void flute(String[] values, ...int nums) {} // ... are before the type


    // exercise 7
    public int juggle(boolean b, boolean... b2) {
        return b2.length;
    }
    void caller() {
//        juggle(true, {true, true}); // not a valid array initializer
        juggle(true, new boolean[] {true, true});
    }


    // exercise 12 - effectively final
    // test: add final keyword rto vars and see what compiles
    public void feed() {
        int monkey = 0;
        if (monkey > 0) { // even if condition is always true it doesn't affect whether a variable is effectively final
            var giraffe = monkey++; // monkey is modified here -> monkey not EF; giraffe is EF
            String name; // this name variable is EF
            name = "geoffrey";
        }
        String name = "milly"; // this a new variable named name, not to be confused with the one in the previous block!
        var food = 10;
        while (monkey <= 10) {
            food = 0; // food is not EF
        }
        name = null; // name is not EF
    }


    // exercise 19
    final String value1 = "red";
    static String value2 = "blue";
    String value3 = "yellow";
    {
        value2 = "purple"; // static var can appear in block initializer
        value3 = "orange";
    }
    static {
        value2 = "cyan"; // only static var here
    }
}
