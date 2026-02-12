package chapter10.review;

import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        var stream = Stream.iterate("", (s) -> s + "1"); // type of lambda param is correctly inferred as String even though it's not specified, and var can then infer from the right side of the assignment
                                                                     // note: this is a valid lambda, param doesn't need explicit type
        System.out.println(stream.limit(2).map(x -> x + "2")); // prints the stream object but not its elements because there is no terminal operation

        var stream2 = Stream.iterate("", (s) -> s + "1"); // need to redeclare because var stream is not usable anymore!
        stream2.limit(2).map(x -> x + "2").forEach(System.out::println); // 2\n12\n     first element of iterate() is the seed, so ""
    }
}
