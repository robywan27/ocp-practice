package chapter7.reviewexercises;

public class Zebra {
    private int x = 24;
    public int hunt() {
        String message = "x is ";
        abstract class Stripes {
            private int x = 0;
            public void print() {
                System.out.println(message + Zebra.this.x); // correct syntax!
            }
        }
        var s = new Stripes() {};
        s.print();
        return x;
    }

    public static void main(String[] args) {
        new Zebra().hunt(); // x is 24
    }
}
