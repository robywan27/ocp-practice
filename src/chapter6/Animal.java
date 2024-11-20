package chapter6;

/*
 * Inheritance: process by which a subclass automatically includes certain members of the class, including primitives,
 *  objects, methods defined in the parent class.
 * Java supports only single inheritance, by which a class may inherit from only one direct parent class.
 * But there can be an arbitrary number of levels of inheritance.
 * Multiple inheritance is not allowed, except for the case of implementing multiple interfaces.
 * */

// superclass or parent class
public class Animal {}

// subclass or child class
class Mammal extends Animal { }

/*
 * - access modifier (e.g. public)
 * - class modifier (e.g. final)
 * - class keyword
 * - class name
 * - extends keyword + parent class name
 *
 * Inheritance is transitive: if X extends from Y and Y extends from Z, then X is a subclass/descendant of Z.
 * All public and protected members are automatically available to the child class.
 * If parent and child are in the same package, the parent's package members are also available to the child class.
 * Private members are never available outside their own class and are never inherited.
 * */

// subclass or child class
final class Rhinoceros extends Mammal { }

/*
* Class modifiers:
* - final: class may not be extended
* - abstract: class requires a concrete subclass to instantiate; may contain abstract methods
* - sealed: class may only be extended by a specific list of classes
* - non-sealed: a subclass of a sealed class permits potentially unnamed subclasses
* - static: for static nested classes defined within a class.
* */
//class Clara extends Rhinoceros {} // can't inherit from Rhinoceros because of final

class Tiger extends Mammal {} // Tiger could be further extended because it's not declared final

class Bird extends Animal {}

class Parrot extends Bird {}

class Eagle extends Bird {}

/*
* Final inheritance looks like this
*                          Animal
*            Mammal                         Bird
* Rhinoceros        Tiger           Parrot        Eagle
* */

/*
* Inheriting Object
* All classes inherit from java.lang.Object. Object is the only class without a parent class.
* If class doesn't extend another class -> the compiler automatically adds extends java.lang.Object to the class
* definition
* If class extends another class -> compiler does nothing
* End result is that every class extends from Object.
* Object's methods are accessible to all classes (e.g. toString() and equals()).
* Primitives don't extend Object because they aren't classes. When autoboxing to their respective classes, those do.
* */


/*
* Class access modifiers
* - a top-level class should not be defined inside another class
* - a .java file can have at most one top-level class
* - there can be any arbitrary number of classes with package level access
* - can't declare a top-level class with protected or private class; only nested classes can
* */

//protected class ClownFish {}
//private class BlueTang {}
class Outer {
    private static class Inner {}
}
