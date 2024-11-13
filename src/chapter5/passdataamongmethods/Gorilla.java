package chapter5.passdataamongmethods;

public class Gorilla {
    public void rest(Long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        var g = new Gorilla();
//        g.rest(8); // can't cast and autobox at the same time
    }
}
