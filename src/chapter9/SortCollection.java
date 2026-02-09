package chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCollection {
    // 1. Comparable interface: natural ordering
    public record Duck(String name, int weight) implements Comparable<Duck> {
        @Override
        public int compareTo(Duck o) {
            return  name.compareTo(o.name);
        }
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Donald", 8));
        ducks.add(new Duck("Daisy", 10));
        Collections.sort(ducks);
        System.out.println(ducks);

        // 2. Comparator interface: custom ordering
        Comparator<Duck> comparator = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        };
        Collections.sort(ducks, comparator);
        System.out.println(ducks);
    }
}
