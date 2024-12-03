package chapter8.functionalinterfaces;

// An interface which contains exactly a single abstract method (SAM)
@FunctionalInterface // optional
public interface Sprint {
    public void sprint(int speed);
}
