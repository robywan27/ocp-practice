package variables;

/*Local variable: a variable defined within a constructor, method or initializer block*/
public class LocalVariable {
    int a; // this is not a local variable, but an instance variable

    public void method() {
        final int x = 10; // final -> constant, cannot change the value
        //    x = 7; // invalid

        int a;
//    int x = a; // local variables have to be initializes before use
    }

    public static void main(String[] args) {
        final int[] numbers = new int[10]; // final can be used with local variable references
        numbers[0] = 2; // can change the value of its data
//        numbers = null; // cannot change the value of its reference
    }

    void findAnswer(boolean check) { // check is a method parameter; in a constructor it's called constructor
        // parameter. It doesn't have to be initialized here; only the caller has to initialize a value when invoking
        // the method
        int answer;
        int otherAnswer;
        if (check) {
            answer = 3;
            otherAnswer = 5;
        }
        else {
            answer = 2;
        }
//        System.out.println(otherAnswer); // the compiler checks all branches of the condition for the initialization
    }

    public LocalVariable() {
        int a; // also a local variable
    }
}
