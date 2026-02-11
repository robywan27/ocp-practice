package chapter10;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        DoubleStream doubleStream = DoubleStream.iterate(1.0, n -> n + 1).limit(10);
        Stream<String> stringStream = Stream.of("a", "b", "c");

//        doubleStream.range(0.0, 1.0); // range(Closed) is not available for DoubleStream!

        LongStream longStream = intStream.mapToLong(Integer::valueOf);

//        IntStream x = intStream.flatMap(e -> IntStream.rangeClosed(1, e)); // stream cannot be reused after mapping from one stream to another
//        IntStream x = intStream.flatMap(e -> LongStream.rangeClosed(1, e)); // can only convert to IntStream

        stringStream.flatMapToDouble(s -> DoubleStream.iterate(1.0, n -> n + 1).limit(s.length())).forEach(System.out::println);

        Stream<Integer> boxed = IntStream.of(1, 2).boxed(); // can only autobox primitive to its wrapper type

        OptionalDouble max = DoubleStream.of(0.0, 1.0, 2.0).max();
    }
}
