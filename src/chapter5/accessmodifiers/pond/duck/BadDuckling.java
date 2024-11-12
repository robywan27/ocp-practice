package chapter5.accessmodifiers.pond.duck;

public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
//        duck.quack(); // cannot access private method
//        System.out.println(duck.noise); // cannot access private property
    }
}
