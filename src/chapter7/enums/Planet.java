package chapter7.enums;

// complex enum
public enum Planet {
    MERCURY("Hot"), VENUS("Hot"), EARTH("Mild"), MARS("Cold"), JUPYTER("Cold"), SATURN("Cold"), NEPTUN("Cold"), URANUS(
            "Cold"), PLUTO("Cold"); // mandatory semicolon; list of values must come first
    private final String climate;
    private Planet(String climate) { // implicitly private
        this.climate = climate;
    }
    public void printClimate() {
        System.out.println(climate);
    }
}
