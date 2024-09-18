package chapter1.objects;

public class Chick {
    /* Constructor:
    *   - same name as class
    *   - no return type
    *
    * Usually you don't need to supply a constructor, the compiler will supply a default do nothing constructor
    *
    * Note that if you assign a return type, it's still a valid method, but it's not a constructor
    * */
    public Chick() {
        System.out.println("Constructor called");
    }

    // main method can be in the class or in another class
    public static void main(String[] args) {
        // create a new instance (object) of class Chick
        // assign the instance to a variable of the class type Chick
        Chick chick = new Chick();
    }
}
