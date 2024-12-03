package chapter8.builtinfunctionalinterfaces;

import java.util.function.Predicate;

/*
* Functional Interface      Return type     Method name         # params
* 1. Supplier<T>                T               get()               0
* 2. Consumer<T>                void            accept(T)           1
* 3. BiConsumer<T, U>           void            accept(T, U)        2
* 4. Predicate<T>               boolean         test(T)             1
* 5. BiPredicate<T, U>          boolean         test(T, U)          2
* 6. Function<T, R>             R               apply(T)            1
* 7. BiFunction<T, U, R>        R               apply(T, U)         2
* 8. UnaryOperator<T>           T               apply(T)            1
* 9. BinaryOperator<T>          T               apply(T, T)         2
*
* Convenience methods:
* - Consumer                    Consumer        andThen()           Consumer
* - Function                    Function        andThen()           Function
* - Function                    Function        compose()           Function
* - Predicate                   Predicate       and()               Predicate
* - Predicate                   Predicate       negate()            -
* - Predicate                   Predicate       or()                Predicate
* */
public class BuiltInInterfaces {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> otherEggs = egg.and(brown.negate());
    }
}
