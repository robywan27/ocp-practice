package chapter8.functionalinterfaces;

// It is a valid functional interface. It can have any other member, but must have one abstract method
public interface Climb {
    boolean bouldering = true;

    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}
