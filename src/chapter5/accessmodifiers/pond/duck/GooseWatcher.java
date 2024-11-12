package chapter5.accessmodifiers.pond.duck;

import chapter5.accessmodifiers.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose(); // code is not in the goose object
//        goose.floatInWater(); // only Goose can refer to members of Bird, but not callers of Goose
    }
}
