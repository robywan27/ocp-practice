package chapter7.enums;

// simple enum
public enum Season {
    WINTER, SPRING, SUMMER, FALL; // optional semicolon
}

//enum HotSeason extends Season {} // can't extend an enum

class SeasonTester {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        switch (spring) {
            case WINTER -> System.out.println("Winter"); // not Season.WINTER!
            case SPRING -> System.out.println("Spring");
            case SUMMER -> System.out.println("Summer");
            case FALL -> System.out.println("Fall");
        }
    }
}
