package chapter5.staticdata;

// static initializers are like instance initializers preceded by word static
public class StaticInitializer {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }
    static {
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }


    private static int one;
    private static final int two;
    private static final int three = 3; // cannot reinitialize anymore
//    private static final int four; // not initialized

    static {
        one = 1;
        two = 2;
//        three = 3; // can't reassign
//        two = 4; // can initialize variable only exactly once in a static block
    }
}
