package chapter3;

import java.util.ArrayList;
import java.util.List;

public class AdvancedPatternMatching {
    // with enums
    enum Color { RED, GREEN, BLUE }

    void compareEnum(Color color) {
//        if (color instanceof Color.RED red) { // does not compile
//            System.out.println(red);
//        }
        System.out.println(switch (color) {
            case RED -> "Red";
            case Color.GREEN -> "Green";
            case BLUE -> "Blue";
        });
    }

    // with sealed classes
    public sealed interface Item permits Potion, Scroll, Weapon {}
    public record Weapon(String name, int damage) implements Item {}
    public record Potion(String name, int heal) implements Item {}
    public record Scroll(String name, int knowledge) implements Item {}

    void processItemWithIf(Item item) {
        if (item instanceof Weapon w) {
            System.out.println("Attacking for " + w.damage());
        }
        else if (item instanceof Potion p) {
            System.out.println("Healing for " + p.heal());
        }
    }

    void processItemWithSwitch(Item item) {
        switch (item) {
            // 1. Type Matching
            case Weapon w -> System.out.println("Attacking with " + w.name());

            // 2. Record Deconstruction (Extracting fields directly!)
            case Potion(String n, int h) -> System.out.println("Drinking " + n + " for " + h);

            case Scroll(String n, int k) -> System.out.println("Reading " + n + " for " + k);
        }
    }
}
