package chapter10.review;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1);
        DoubleStream ds = s.mapToDouble(x -> x); // ToDoubleFunction expects T (Integer) and returns double; Integer can be unboxed to int and then widened to double
    }
}
