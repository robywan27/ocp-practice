package chapter10.review;

import java.util.Spliterator;
import java.util.stream.Stream;

public class Exercise21 {
    public static void main(String[] args) {
        Spliterator<String> spliterator = Stream.generate(() -> "x")
                .spliterator();
//        spliterator.forEachRemaining(System.out::println); // does not terminate
        spliterator.tryAdvance(System.out::println); // x

        Spliterator<String> split = spliterator.trySplit();
//        split.forEachRemaining(System.out::println); // does not terminate
        split.tryAdvance(System.out::println); // x

        // can keep splitting and advancing
        spliterator.trySplit().tryAdvance(System.out::println); // x
        spliterator.trySplit().trySplit().tryAdvance(System.out::println); // x
        split.trySplit().trySplit().trySplit().tryAdvance(System.out::println); // x
    }
}
