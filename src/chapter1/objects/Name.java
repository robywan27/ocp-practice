package chapter1.objects;

public class Name {
    String firstName = "Robertino";
    String lastName = "Napoli";
    String fullName = firstName + lastName; // can already read the value of an initialized field; it has to be declared
    // after that field

    public static void main(String[] args) {
        Name name = new Name();
        System.out.println(name.fullName);
    }
}
