package chapter1.datatypes;

/*Wrapper classes
 * Reference types that correspond to the corresponding primitive
 * */
public class WrapperClass {
    public static void main(String[] args) {
        Boolean bool2 = Boolean.valueOf(false);
        System.out.println(bool2);
        Character character = Character.valueOf('d');
        System.out.println(character);
        Byte b2 = Byte.valueOf((byte) 123); // need casting of default integer literal
        System.out.println(b2);
        Short s2 = Short.valueOf((short) 123); // need casting of default integer literal
        System.out.println(s2);
        Integer integer = Integer.valueOf(123);
        System.out.println(integer);
        Long l2 = Long.valueOf(123);
        System.out.println(l2);
        Float f2 = Float.valueOf(12.34f);
        System.out.println(f2);
        Double d2 = Double.valueOf(12.3);
        System.out.println(d2);

        // from String
        int primitive = Integer.parseInt("123");
        System.out.println(primitive);
        Integer wrapper = Integer.valueOf("123");
        System.out.println(wrapper);

        // helper methods
        Double apple = Double.valueOf("200.23");
        System.out.println(apple.byteValue()); // prints -56
        System.out.println(apple.intValue()); // truncated to 200
        System.out.println(apple.doubleValue());
        System.out.println(character.charValue());
        int max = Integer.max(7, 3);
        System.out.println(max);
    }
}
