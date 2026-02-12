package chapter10.review;

import java.util.List;
import java.util.stream.Stream;

public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();
//        Stream.of(x1, x2, x3)
//                .map(x -> x + 1) // doesn't compile because x is of type List
//                .flatMap(x -> x.stream())
//                .forEach(System.out::println);

//        Stream.of(x1, x2, x3)
//                .flatMap(x -> x + 1) // still doesn't compile even when switching map with flatMap unlike what the solution says
//                .map(x -> x.stream())
//                .forEach(System.out::println);
    }
}
