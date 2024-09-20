package chapter1;

// Exercise 5 and 15
    // An object may never be garbage collected, such as if the program ends before garbage collection runs.
    // Once the program ends, everything is removed, including the heap. GC is only useful while the program runs


public class ReviewExercises {
    // Exercise 7
    // numForks and numKnives vars are not referenced in the string block
    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.println("""
                "# forks = " + numForks +
                "# knives = " + numKnives +
                # cups = 0""");


        // prints things from exercises below in class T
        T t = new T();
        System.out.println(t.blocky());
        System.out.println(t.code);
        System.out.println(t.f);
        System.out.println(t.max());

        int c = 0;
        c++; // equivalent to c = c + 1, valid instruction, and modifies the value of the variable
        System.out.println(c);
    }
}


class T {
// Exercise 8 and 18
    void meth() {
//        var i = 1, a = 3; // does not compile, var can't be used in multiple-variable assignment!!
    }


    // Exercise 14
    //int numGrains = 2.0; // does not compile, there is no implicit casting happening
    byte b = 12; // automatically down-casted from int value
    short sh = 12; // automatically down-casted from int value
//    short sh2 = 12L; // invalid
    long l = 12;
    //    int i = 1L; // invalid - bigger value than container can accept
//    int i = 0f; // invalid
//    float f = 0.0; // invalid - bigger value than container can accept
    double d = 0f; // valid!


    // Exercise 16
        // \s keeps the whitespace, otherwise any trialing space is usually ignored
    String blocky() {
        var blocky = """
                squirrel \s
                pigeon \
                termite""";
        return blocky;
    }


    // Exercise 17
    float code; // float values aren't printed with f suffix!!
//    float f = 0.0; // invalid
    float f = 0f;


    // Exercise 19
        // Primitive wrapper class can be used as a primitive value itself
        // Even though the signature of max is Long.max(long a, long b), the code is correct if you pass wrapper
    // class Long instead of long
    long max() {
        var num1 = Long.parseLong("100"); // type long
        var num2 = Long.valueOf("100"); // type Long

        return Long.max(num1, num2);
    }
    long ll = 12L;
    Long lL = 14L;
    long llL = ll + lL; // can do operation between Long and long as if they were the same type
    Long lLL = llL; // automatic wrapping at assignment


    // Exercise 22
        // pay attention to the whole exercise, don't focus only on what's valid, but also the big picture
            // option A is wrong because Amount is different from amount
//         int amount = 9L // invalid, must assign to long variable
//        int amount = 1_2.0; // invalid, must assign to double variable
}
