package chapter7.reviewexercises;

public class Lion {
    class Cub {}
    static class Den {}
    static void rest() {
        Cub c;
//        Lion.Cub cub = new Cub(); // doesn't compile
        Lion.Cub cub = new Lion().new Cub(); // can access Cub non-static inner class
        var d = new Den();
        Lion.Den g = new Lion.Den();
    }
}
