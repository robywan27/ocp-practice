package chapter5.overloading;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Parrot {
    public static void print(List<Integer> i) {
        System.out.println("I");
    }public static void print(CharSequence c) {
        System.out.println("C");
    }
    public static void print(Object o) {
        System.out.println("O");
    }

    public static void main(String[] args) {
        print("abc"); // C
        print(Arrays.asList(3)); // I
        print(LocalDate.of(2019, Month.APRIL, 4)); // O
    }
}
