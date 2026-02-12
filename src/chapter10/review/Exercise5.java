package chapter10.review;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Exercise5 {
    public static void main(String[] args) {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x) // function of type: long -> int
                .boxed() // needed because groupingBy() only works with reference types
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result); // 8.0
    }
}
