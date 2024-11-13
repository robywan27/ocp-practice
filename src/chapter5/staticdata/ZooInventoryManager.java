package chapter5.staticdata;

public class ZooInventoryManager {
    private static final String[] treats = new String[10]; // final reference variable, cannot assign another object

    public static void main(String[] args) {
        treats[0] = "popcorn"; // allowed to modify the object
    }
}
