package chapter8.methodreferences;

// 2. instance methods on a particular object
public interface StringStart {
    boolean beginningCheck(String prefix);
}

class StringStartTester {
    public static void main(String[] args) {
        var str = "Zoo";
//        StringStart start = s -> str.startsWith(s);
        StringStart start = str::startsWith;
        System.out.println(start.beginningCheck("A")); // false
        System.out.println(start.beginningCheck("Zo")); // true
    }
}
