package chapter10;

import java.util.stream.Stream;

public class NonTerminatingIntermediateOperations {
    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println); // Elsa\nElsa

        // sorted() must wait for the entire stream to be generated before it can sort
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted() // doesn't terminate
//                .limit(2)
//                .forEach(System.out::println);

        System.out.println();
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .distinct() // doesn't wait
                .limit(2)
                .forEach(System.out::println); // Elsa
    }
}
