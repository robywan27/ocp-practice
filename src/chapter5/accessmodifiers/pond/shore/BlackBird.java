package chapter5.accessmodifiers.pond.shore;

import chapter5.accessmodifiers.pond.swan.Swan;

public class BlackBird extends Bird {
    public void swim() {
        floatInWater(); // protected (and package) access
        System.out.println(text); // protected (and package) access
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird(); // Bird reference instead of inheritance
        other.floatInWater(); // compare with Swan class. Here code compiles because it's located in the same package
        // as Bird
        System.out.println(other.text);
    }
}
