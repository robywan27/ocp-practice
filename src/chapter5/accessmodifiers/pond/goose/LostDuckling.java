package chapter5.accessmodifiers.pond.goose;

import chapter5.accessmodifiers.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim(); // public visibility is accessible everywhere
        System.out.println("Thanks " + teacher.name); // public visibility is accessible everywhere
    }
}
