A Java object can be accessed using a reference:
- with the same type as the object
- of a superclass of the object
- of an interface implemented by the object

> the type of the reference determines which methods and fields can be accessed

## Casting rules for assignments
- casting a reference from a subtype to a supertype doesn't require an explicit cast
- casting a reference from a supertype to a subtype requires an explicit cast
- at runtime, an invalid cast of a reference to an incompatible type causes a ClassCastException to be thrown
- the compiler doesn't allow casts to unrelated types

> note: the compiler cannot enforce rules about casting to interfaces because they can be implemented by any classes (except when it's not possible such as if the class is declared final)

## Method arguments
You can pass any subtype or the type itself (unless it's abstract). Opposite of the polymorphism rules for assignments (see previous paragraph)

## Overriding
Overriding a method means replacing all calls to it, including those defined in the parent class.
### Hiding members
Hiding fields/methods are sensitive to the reference type and location where the member is used