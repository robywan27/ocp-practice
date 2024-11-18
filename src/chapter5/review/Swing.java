package chapter5.review;

public class Swing {
    private static final String leftRope;
    private static final String rightRope;
//    private static final String bench; // bench should be initialized either at declaration or in static initializer
    private static final String name = "name";
    static {
        leftRope = "left";
        rightRope = "right";
    }
    static {
//        name = "name"; // name cannot be reassigned
//        rightRope = "right"; // right cannot be reassigned
    }

    public static void main(String[] args) {
//        bench = "bench"; // this is initialized too late
    }
}
