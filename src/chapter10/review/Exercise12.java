package chapter10.review;

import java.util.Set;
import java.util.stream.Stream;

public class Exercise12 {
    public static void main(String[] args) {
        Set<String> birds = Set.of("oriole", "flamingo");
        Stream.concat(birds.stream(), birds.stream()/*, birds.stream()*/) // concat takes only two params
                .sorted()
                .distinct()
                .findAny()
                .ifPresent(System.out::println); // flamingo or oriole (most likely flamingo for sequential streams, but not guaranteed for parallel streams)
    }
}
