package chapter5.accessmodifiers.pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack(); // method access is ok because of package visibility
        System.out.println(duck.noise); // property access is ok because of package visibility
    }
}
