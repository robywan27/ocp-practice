package chapter1.objects;

/* Order of initialization:
*   1. fields and instance initializer blocks are run in the order in which they appear in the file
*   2. constructor is run
* */
public class Egg {
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number); // 3. number is assigned 5
        // printed: 5
    }

    private int number = 3; // 1. number is assigned value 3
    { number = 4; } // 2. number is assigned 4
}
