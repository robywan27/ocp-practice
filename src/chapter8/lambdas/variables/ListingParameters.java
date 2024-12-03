package chapter8.lambdas.variables;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListingParameters {
    public static void main(String[] args) {
        // all three are identical
        // a lambda infers the types from the context
        // here Predicate takes a String
        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true; // var can be used in place of the type
        Predicate<String> p3 = (String x) -> true;

        // three formats to specify parameter types within a lambda: without types, with types, with var. Can't mix
        // and match!
//        (var x, y) -> "Hello";
//        (var x, Integer y) -> true;
    }

    // inferring type via method signature
    public void whatAmI() {
        consume((var x) -> System.out.println(x), 123); // type of lambda param is Integer
    }
    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

    // inferring type via method param
    public void counts(List<Integer> list) {
        list.sort((final var x, @Deprecated var y) -> x.compareTo(y)); // lambda infers type via type of List passed
        // as method param (modifiers here are irrelevant, it's legal to use them)
    }
}
