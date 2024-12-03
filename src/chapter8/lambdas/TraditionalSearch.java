package chapter8.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, new CheckIfHopper()); // using an instance of a class to implement the interface

        // Lambdas
        // deferred execution, lambda body will be executed in print() (lazy evaluation in FP languages)
        // lambdas work with functional interfaces, i.e. interfaces that define exactly one abstract method
        // context is used to work out a lambda expression - Java maps the lambda to the abstract method declaration in
        // the CheckTrait interface, because that's what's expected as second param in print()
        print(animals, a -> a.canHop()); // use lambda instead
        // parameter name: parentheses can be omitted if there is a single param
        // body: can omit braces, return and semicolon if there is a single statement
        // short and long syntax can be mixed and matched
        print(animals, (Animal a) -> { return a.canHop(); }); // equivalent lambda expression but in extended form
        print(animals, a -> !a.canSwim()); // can define any other logic without redefining a new class

//        var invalid = (Animal a) -> a.canHop(); // invalid
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) System.out.print(animal + " ");
        }
        System.out.println();
    }
}
