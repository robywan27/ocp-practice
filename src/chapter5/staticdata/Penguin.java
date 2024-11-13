package chapter5.staticdata;

/*
* Static variables
* doesn't require an instance of the class
* variable shared by all class instances
* */
public class Penguin {
    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";

        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy"; // modifies a class variable shared by all its instances

        System.out.println(p1.name); // Lilly
        System.out.println(p1.nameOfTallestPenguin); // Willy <-
        System.out.println(p2.name); // Willy
        System.out.println(p2.nameOfTallestPenguin); // Willy
    }
}
