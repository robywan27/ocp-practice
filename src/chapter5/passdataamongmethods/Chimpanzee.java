package chapter5.passdataamongmethods;

// unboxing and autoboxing in method calls
public class Chimpanzee {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int t) {}

    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123); // implicit casting
        c.swing(123); // implicit autoboxing
//        c.jump(123L); // invalid casting from larger type to narrower type
    }
}
