package chapter8.builtinfunctionalinterfaces;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

@FunctionalInterface
interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

class FunctionTester {
    public static void main(String[] args) {
//        Function<String, Integer> f = s -> s.length();
        Function<String, Integer> f = String::length;
        System.out.println(f.apply("Rotterdam")); // 9

//        BiFunction<String, String, String> b = (s, t) -> s.concat(t);
        BiFunction<String, String, String> b = String::concat;
        System.out.println(b.apply("functional", "programming")); // functionalprogramming
    }
}
