package chapter5.review;

public class Rope {
    public static void swing() {
        System.out.print("swing");
    }
    public void climb() {
        System.out.println("climb");
    }
    public static void play() {
        swing();
//        climb();
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play(); // no compilation error even though climb() on line 12 doesn't compile
        Rope rope2 = null;
        System.out.print("-");
        rope2.play(); // swing-swing
    }
}
