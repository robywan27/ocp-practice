package chapter5.staticdata;

public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
        // access a static member: class name . property/method
        // note that here because we are in the same class it is also possible to just call the member directly
        // without class
        System.out.println(Snake.hiss); // 2
        System.out.println(hiss); // 2

        /*
         Note: If you use an instance to call the static member, the compiler checks for the type of the reference
         and uses that instead of the object. So even if the object points to null, there is no NullPointerException!
         */
        Snake s = new Snake();
        System.out.println(s.hiss); // 2
        s = null;
        System.out.println(s.hiss); // 2 - not NullPointerException

        Snake.hiss = 4;
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss); // 5
    }
}
