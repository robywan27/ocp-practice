package chapter7.reviewexercises;

public interface Omnivore {
//    int findMore() { return 2; } // implicitly abstract, unless default, static or private (static)
    private int findMorePrivate() { return 2; }
    private static int findMorePrivateStatic() { return 2; }
    static int findMoreStatic() { return 2; }
    default int findMoreDefault() { return 2; }
}
