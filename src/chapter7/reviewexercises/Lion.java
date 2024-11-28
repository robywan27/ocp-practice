package chapter7.reviewexercises;

public class Lion {
    class Cub {}
    static class Den {}
    static void rest() {
        Lion.Cub c = new Lion().new Cub(); // can access Cub non-static inner class
        var d = new Den();
        Lion.Den g = new Lion.Den();
    }
}
