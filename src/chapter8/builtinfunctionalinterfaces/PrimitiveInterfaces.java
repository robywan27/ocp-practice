package chapter8.builtinfunctionalinterfaces;

/*
* Functional interfaces provided only to types double, int, long, except BooleanSupplier for boolean
*
* Supplier: DoubleSupplier, IntSupplier, LongSupplier
* <Type>Consumer
* <Type>Predicate
* <Type>Function<R> with return type R
* <Type>UnaryOperator
* <Type>BinaryOperator
*
* To<Type>Function
* To<Type>BiFunction
* Obj<Type>Consumer
* DoubleToIntFunction
* LongToDoubleFunction
* ...
*
* - many generics are gone and instead the type name tells what primitive type is involved
* - the abstract method is often renamed when a primitive type is returned
* */
public class PrimitiveInterfaces {
}