package chapter5.accessmodifiers.pond.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // can access because of package visibility
        System.out.println(bird.text); // can access because of package visibility
    }
}
