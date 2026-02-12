package chapter10.review;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise16 {
    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        Stream<String> firstIntermediateResult = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty);
        firstIntermediateResult.forEach(System.out::println); // nothing is printed

        Map<String, List<String>> secondIntermediateResult = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k));
        System.out.println(secondIntermediateResult); // {}

        Stream<List<String>> thirdIntermediateResult = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue);
        thirdIntermediateResult.forEach(System.out::println); // nothing is printed

        Stream<String> fourthIntermediateResult = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream);
        fourthIntermediateResult.forEach(System.out::println); // nothing is printed

        var result = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);

        var result2 = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(n -> n));
        System.out.println(result2); // {}
    }
}
