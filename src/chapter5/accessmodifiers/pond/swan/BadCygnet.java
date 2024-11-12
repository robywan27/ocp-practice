package chapter5.accessmodifiers.pond.swan;

import chapter5.accessmodifiers.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack(); // can't access method because this class is located in another package
//        System.out.println(duck.noise); // can't access property because this class is located in another package
    }
}
