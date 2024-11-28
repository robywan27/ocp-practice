package chapter7.reviewexercises;

public class Favorites {
    public static void main(String[] args) {
        var array = new String[] {"ciao", "hey"};
        for (final var a : array) {
            System.out.println(a); // loop var can be declared final! But cannot be re-assigned within loop
//            a = "new"; // invalid
        }
    }
}
