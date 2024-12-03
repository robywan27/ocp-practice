package chapter8.methodreferences;

// 4. constructors
public interface EmptyStringCreator {
    String create();
}

class EmptyStringCreatorTester {
    public static void main(String[] args) {
//        EmptyStringCreator creator = () -> new String();
        EmptyStringCreator creator = String::new;
        System.out.println(creator.create()); // ""
    }
}


interface StringCopier {
    String copy(String value);
}

class StringCopierTester {
    public static void main(String[] args) {
//        StringCopier copier = s -> new String(s);
        StringCopier copier = String::new;
        System.out.println(copier.copy("zebra")); // zebra
    }
}
