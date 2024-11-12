package chapter5.accessmodifiers.pond.goose;

import chapter5.accessmodifiers.pond.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // can access method because it's declared protected and this is a subclass
        System.out.println(text); // can access property because it's declared protected and this is a subclass
    }

    public static void main(String[] args) {
        new Gosling().swim();
    }
}
