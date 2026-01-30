package chapter7.enums;

// simple enum
public enum Season {
    WINTER, SPRING, SUMMER, FALL; // optional semicolon
}

//enum HotSeason extends Season {} // can't extend an enum

class SeasonTester {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(
                switch (spring) {
                    case Season.WINTER -> "It's cold!"; // only from version 21!
                    case SPRING -> "Flowers bloom!";
                    case SUMMER -> "Time for the beach!";
                    case FALL -> "Leaves fall!";
                }
        );
    }
}
