package chapter9;

import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        var m = Map.ofEntries(Map.entry("a", 1), Map.entry("b", 2)); // creates an immutable map!
        m.put("c", 3);
        m.forEach((k, v) -> System.out.println(k + ", " + v));
    }
}
