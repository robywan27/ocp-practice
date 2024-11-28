package chapter7.nestedclasses;

public class Apartment extends Home {
    public static void main(String[] args) {
        var apartment = new Apartment();
        apartment.enterRoom();
        Room.greet("hello");
    }
}
