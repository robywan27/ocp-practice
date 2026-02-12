package chapter10.review;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, x -> x++) // produces a stream of 1s because x++ returns the value of x before incrementing it
                .limit(5)
                .map(x -> "" + x) // Collectors.joining() requires a stream of Strings
                .collect(Collectors.joining())); // 11111

        System.out.println(Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining())); // 12345 (seed is always first element and not operated on by the lambda)
    }
}
