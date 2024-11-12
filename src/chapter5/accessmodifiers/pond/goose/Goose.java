package chapter5.accessmodifiers.pond.goose;

import chapter5.accessmodifiers.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater(); // protected access
        System.out.println(other.text); // protected access
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose(); // object is of type Goose, but it is stored in a Bird reference
//        other.floatInWater(); // reference type of other is not a subclass of Goose and this code is not in the same
//        package of Bird
//        System.out.println(other.text);
    }
}
