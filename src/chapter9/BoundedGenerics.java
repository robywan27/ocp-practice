package chapter9;

import java.util.ArrayList;
import java.util.List;

public class BoundedGenerics {
    // lower bound wildcard
    public static void addSound(List<? super String> list) {
            list.add("quack");
    }

    // upper bound wildcard
    public static void cannotAddSound(List<? extends String> list) {
//            list.add("quack"); // cannot add more to the list
    }

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("tweet");
        var objects = new ArrayList<Object>(strings);

        addSound(strings);
        addSound(objects);
        System.out.println(strings);
        System.out.println(objects);
    }
}
