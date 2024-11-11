package chapter4;

public class MathAPI {
    public static void main(String[] args) {
        // minimum and maximum
        int max = Math.max(6, 3);
        int min = Math.min(-6, 3);
        System.out.println(max); // 6
        System.out.println(min); // -6


        // rounding
        int low = Math.round(123.45f); // round(float) returns an int
        long high = Math.round(123.50);
//        int high = Math.round(123.50); // round(double) returns a long
        System.out.println(low); // 123 - rounded down
        System.out.println(high); // 124 - .5 or higher is rounded up


        // ceiling and floor
        double c = Math.ceil(3.14);
        double f = Math.floor(3.14);
        double same = Math.ceil(3);
        double same2 = Math.floor(3);
//        long l = Math.floor(3.14); // ceil(double) or floor(double) return double
        System.out.println(c); // 4.0
        System.out.println(f); // 3.0
        System.out.println(same); // 3.0
        System.out.println(same2); // 3.0


        // exponents
        double squared = Math.pow(5, 2);
        double sqrt = Math.pow(25, 0.5);
        double squaredFraction = Math.pow(2, -2);
//        float squared = Math.pow(5, 2); // pow(double, double) returns return double
        System.out.println(squared); // 25.0
        System.out.println(sqrt); // 5.0
        System.out.println(squaredFraction); // 0.25


        // generate random numbers
        double num = Math.random();
        System.out.println(num); // random double between 0 and 1 (exclusive)
    }
}
