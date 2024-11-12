package chapter5.accessmodifiers.pond.swan;

import chapter5.accessmodifiers.pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater(); // protected access
        System.out.println(text); // protected access
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan(); // Swan inherits from Bird, just it's an instantiated object rather than an
        // inherited one
        other.floatInWater(); // protected access
        System.out.println(other.text); // protected access
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird(); // Bird reference instead of inheritance
//        other.floatInWater(); // Bird is in a different package and other doesn't inherit from Bird -> can't use
        // protected members
//        System.out.println(other.text); // same
    }
}
