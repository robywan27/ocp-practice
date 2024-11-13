package chapter5.passdataamongmethods;

/*
* Autoboxing: process of converting a primitive into its equivalent wrapper class
* Unboxing: process of converting a wrapper class into its equivalent primitive
* */
public class Boxing {
    public static void main(String[] args) {
        int quack = 5;
        Integer quackquack = Integer.valueOf(quack); // explicit - primitive to wrapper class
        int quackquackquack = quackquack.intValue(); // explicit - wrapper class to primitive

        quackquackquack = quackquack; // implicit - autoboxing
        quackquack = quack; // implicit - unboxing


        Short tail = 8; // autoboxing
        Character p = Character.valueOf('p');
        char paw = p; // unboxing
        Boolean nose = true; // autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e; // unboxing, then implicit casting
//        Long badGorilla = 8; // cannot autobox and implicitly cast a smaller primitive to a larger type at the same
//        time. It's either autobox to Integer or cast to long

        Character elephant = null;
        char badElephant = elephant; // NullPointerException - unboxing to a primitive doesn't work
    }
}
