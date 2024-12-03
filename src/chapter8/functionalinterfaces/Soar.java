package chapter8.functionalinterfaces;

// if a functional interface includes an abstract method with the same signature as a public method found in Object,
// those methods don't count toward the SAM test

//@FunctionalInterface // complains that abstract method is not found
public interface Soar {
    abstract String toString();
}
