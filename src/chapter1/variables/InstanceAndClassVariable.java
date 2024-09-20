package chapter1.variables;

public class InstanceAndClassVariable {

    public static void main(String[] args) {
        Person father = new Person();
        Person mother = new Person();
        father.name = "Jack";
        mother.name = "Jennifer";

        System.out.println(father.name);
        System.out.println(mother.name);
        System.out.println(Person.species);
        System.out.println(Person.isPerson);
        System.out.println(Person.numberOfLimbs);
        System.out.println(father.species);
        System.out.println(mother.species);
    }
}

class Person {
    /*Instance variable or field
    * Its value is defined within a specific instance of a class.
    * Each instance can assign a different value to the variable and changing the value for one doesn't change the
    * value for any other instance
    * */
    String name; // doesn't need to be initialized: default value is assigned. Here it's null

    /*Class chapter1.variables
    * It is defined at the class level and shared among all instances of the class.
    * They are marked by the static keyword.
    * It can be publicly accessible outside the class and doesn't need an instance to be used
    * */
    static String species = "Homo Sapiens"; // doesn't need to be initialized: default value is assigned
    static double numberOfLimbs; // default is zero
    static boolean isPerson; // default is false
}
