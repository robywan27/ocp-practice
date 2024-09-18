package chapter1.datatypes;

/*Reference types
 * Refers to an object via a pointer: they store the memory address where the object is located
 * */
public class ReferenceType {
    public static void main(String[] args) {
        String str = new String("Imma string"); // initialize by assigning a new object
        System.out.println(str);
        String str2 = str; // initialize by assigning another object of the same type
        System.out.println(str2);
    }
}
