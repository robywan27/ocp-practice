package chapter6.constructors;

public class Turtle {
    private String name;
    /*
    * Constructor overloading
    * Multiple constructors with different signatures (basically only param list is different)
    * */
    public Turtle() {
        name = "John Doe";
    }
    public Turtle(int age) {}
    public Turtle(long age) {}
    Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }

    public static void main(String[] args) {
        /*
        * Instantiation: creation of a new instance of a class
        * A constructor is called via the new keyword: compiler allocates memory for the new object, then looks for a
        *  constructor with a matching signature and calls it
        * */
        var t1 = new Turtle();
        var t2 = new Turtle(2L);
        var t3 = new Turtle("Raffaello", "burgers", "fries");
    }
}
