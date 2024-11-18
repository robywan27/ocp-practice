package chapter5.review;

// exercise 18 - pass-by-value

public class StringBuilders {
    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a"); // this doesn't change the reference of the caller passed to a
        b.append("b"); // this modifies the value of the arg passed to b
        return a;
    }

    public static void main(String[] args) {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1, s2);
        System.out.println("s1 = " + s1); // s1 = s1
        System.out.println("s2 = " + s2); // s2 = s2b
        System.out.println("s3 = " + s3); // s3 = a
    }
}
