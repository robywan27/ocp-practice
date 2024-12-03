package chapter8.functionalinterfaces;

// if a functional interface includes an abstract method with the same signature as a public method found in Object,
// those methods don't count toward the SAM test

@FunctionalInterface
public interface Soar {
    abstract String toString(); // same signature as toString() method defined in Object
    void fly(); // this is the only method that counts in the SAM test
}
