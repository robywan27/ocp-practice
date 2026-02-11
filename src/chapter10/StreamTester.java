package chapter10;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Stream<Integer> infinite = Stream.iterate(0, n -> n + 1);
        Collector<Object, ?, Long> c = Collectors.counting();

//        infinite.sorted().forEach(System.out::println); // hangs indefinitely and nothing is printed, because sorted() waits for all elements before sorting

        infinite.map(x -> "" + x).limit(10).forEach(System.out::println);
//        infinite.filter(e -> e % 2 == 0).forEach(System.out::println); // exception, stream has already been operated upon or closed

        var pred = stream.filter(e -> e % 2 == 0);
        pred.filter(e -> e % 2 == 0).count(); // can use as many intermediate operations but once you apply the terminal operation, the stream is closed and cannot be used anymore

    }
}
