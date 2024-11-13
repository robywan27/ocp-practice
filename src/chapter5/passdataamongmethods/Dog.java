package chapter5.passdataamongmethods;

public class Dog {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name); // Webby

        var surname = new StringBuilder("McDonnell");
        speak(surname);
        System.out.println(surname); // McDonnellJones
    }

    // pass-by-value happens also with reference types
    public static void speak(String name) {
        name = "Georgette";
    }

    // calling methods on a reference can affect the caller
    public static void speak(StringBuilder s) {
        s.append("Jones"); // this operation has a side effect on StringBuilder
    }
}
