package chapter5.review;

import chapter5.review.rope.Rope;
import static chapter5.review.rope.Rope.*;

// exercise 13

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    { // this is not a static initializer
        System.out.println(rope1.length); // this is never executed because RopeSwing is never constructed
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length); // 8 - if initializer was static, result would be 08
    }
}
