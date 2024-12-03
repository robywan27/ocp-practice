package chapter8.methodreferences;

// 3. instance methods on a parameter
public interface StringParameterChecker {
    boolean check(String text);
}

class StringParameterCheckerTester {
    public static void main(String[] args) {
//        StringParameterChecker stringParamChecker = s -> s.isEmpty();
        StringParameterChecker stringParamChecker = String::isEmpty; // not a static method!

        System.out.println(stringParamChecker.check("Zoo")); // false - isEmpty() is applied to the param passed at
        // runtime "Zoo" to the interface method
    }
}


interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

class StringTwoParameterCheckerTester {
    public static void main(String[] args) {
//        StringTwoParameterChecker twoParamChecker = (s, p) -> s.startsWith(p); // order matters: the first param is
//        always the instance of the object for instance methods, and the others are method params
        StringTwoParameterChecker twoParamChecker = String::startsWith;
        System.out.println(twoParamChecker.check("Zoo", "Z")); // true
    }
}
