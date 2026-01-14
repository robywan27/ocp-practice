package chapter2;

public class ReviewExercises {
    public static void main(String[] args) {
        // Exercise 3.
        long l = 23; // omitting L still compiles!
//        int i = 23L; this however doesn't compile

        // Note: bitwise complement operator (~) can only be applied to integer values
        var a = ~3;
//        var b = ~3.0;


        // Exercise 8
        int pig = 2;
        // value 2 returned by post-increment operator
        // pig variable is assigned this value, so increment operation is discarded
        pig = pig++;
        System.out.println(pig); // 2 instead of 3

        int pork = 2;
        pork++;
        System.out.println(pork); // 3


        // Exercise 9
        // What are the unique outputs of the code snippet
        // It means to choose all the options corresponding to the outputs of the program

        // 16.
        // equality with numbers doesn't care whether they are the exact same type:
        double song = 2.0;
        float symphony = (float) ((song == 1_000f) ? song * 2L : song);
        byte b = 2;
        short s = 2;
        var r = b == s ? 1 : 3;

        // 19.
        int start = 7;
        start = (byte) (Byte.MAX_VALUE + 10);
        System.out.println(start); // prints negative number going backwards from max value
    }
}
