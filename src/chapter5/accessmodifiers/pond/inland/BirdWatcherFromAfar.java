package chapter5.accessmodifiers.pond.inland;

import chapter5.accessmodifiers.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // can't access because of this class is in a different package
//        System.out.println(bird.text); // can't access because of this class is in a different package
    }
}
