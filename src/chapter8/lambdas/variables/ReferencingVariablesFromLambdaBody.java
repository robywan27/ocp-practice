package chapter8.lambdas.variables;

import java.util.function.Consumer;

public class ReferencingVariablesFromLambdaBody { }

/*
* lambda bodies can reference vars from surrounding code:
* - instance and class vars: always allowed
* - local vars, method params: only if they are final or effectively final
* - lambda params: allowed
*/

class Crow {
    private String color; // can always be referenced
    public void caw(String name) { // effectively final
        String volume = "loud"; // effectively final
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                    + volume + " that she is " + color);
    }
}
