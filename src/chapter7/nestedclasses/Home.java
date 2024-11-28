package chapter7.nestedclasses;

/*
* Four types:
* 1. inner class: a non-static type defined at the member level of a class
*   a. can be declared with all four access modifiers
*   b. can extend a class and implement interfaces
*   c. can be marked abstract or final
*   d. can access members of the outer class, including private members
* 2. static nested class: a static type defined at the member level of a class
*   a. nesting creates a namespace, because the enclosing class name must be used to refer to it
*   b. it can be marked private or protected
*   c. the enclosing class can refer to the fields and methods of the static nested class
* 3. local class: a class defined within a method body
*   a. can access final and effectively final local variables
*   b. do not have an access modifier
*   c. can be declared final or abstract
*   d. have access to all fields and methods of the enclosing class (when defined in an instance method)
* 4. anonymous class: special case of a local class that does not have a name
*   a. must have exactly one superclass or one interface
*   b. do not have an access modifier
* */
public class Home {
    private String greeting = "Hi";

    protected class Room {
        public int repeat = 3;
        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }
        protected static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {
        var room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        var home = new Home();
        home.enterRoom();

        var room = home.new Room(); // that's how you instantiate an inner class!
        room.enter();
//        var room = new Room(); // this doesn't work; cannot instantiate Room from main static context; Room is a
//        member of Home so same rules as with properties/methods apply
        Room.greet("ciao");
//        System.out.println(Home.Room); // can't get an instance of Room via an instance of Home either; can only
//        call a static member in Room
    }
}
