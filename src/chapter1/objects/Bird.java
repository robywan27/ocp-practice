package chapter1.objects;

// everything in between { and } is a code block
public class Bird {
    public static void main(String[] args) {
        { System.out.println("inner block"); } // only called when method is invoked
    }

    { System.out.println("instance initializer"); } // instance initializer: only when outside a method
}
