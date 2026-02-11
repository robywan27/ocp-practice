package chapter10;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReducer {
    public static void main(String[] args) {
        var stream = Stream.of("a", "b", "c");
        /*
        composed of:
        - initializer
        - accumulator: what's computed for each element in the stream; instead of accumulating the intermediate result, it replaces the old total with the new total
        - combiner: only used in parallel streams, it combines the intermediate totals of each thread into a single total
         */
        int length = stream.reduce(0, (n, s) -> n + s.length(), Integer::sum);
        System.out.println(length); // 3
    }
}
