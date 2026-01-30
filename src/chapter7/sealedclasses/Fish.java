package chapter7.sealedclasses;

abstract sealed class Fish permits Trout, Bass {
    public static void main(String[] args) {

    }
}
final class Trout extends Fish {}
final class Bass extends Fish {}

class Tester {
    public static String getType(Fish fish) {
        return switch (fish) {  // pattern matching
            case Trout t -> "This is a Trout.";
            case Bass b -> "This is a Bass.";
            // no default case required if the class is abstract! Same if it's an interface (abstract by default)
//            case Fish f -> "This is a Fish."; // if Fish is not abstract, then need to add a case for Fish (can be instantiated) or just default
        };
    }

    public static void main(String[] args) {
        Fish fish1 = new Trout();
        Fish fish2 = new Bass();
        System.out.println(getType(fish1));
        System.out.println(getType(fish2));
    }
}