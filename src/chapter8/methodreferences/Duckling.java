package chapter8.methodreferences;

/*
* Method references make code even more concise than lambda expressions
* :: operator is like a lambda, used for deferred execution with a functional interface
* Four formats of method references:
*   1. static methods
*   2. instance methods on a particular object
*   3. instance methods on a parameter to be determined at runtime
*   4. constructors
* */
public class Duckling {
    public static void makeSound(String sound) {
//        LearnToSpeak learner = s -> System.out.println(s); // lambda expression
        LearnToSpeak learner = System.out::println; // equivalent method reference
        DuckHelper.teacher(sound, learner);
    }
}
