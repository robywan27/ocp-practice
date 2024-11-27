package chapter7;

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

        var room = home.new Room();
        room.enter();
//        var room = new Room(); // this doesn't work; cannot instantiate Room from main static context; Room is a
//        member of Home so same rules as with properties/methods apply
        Room.greet("ciao");
//        System.out.println(Home.Room); // can't get an instance of Room via an instance of Home either; can only
//        call a static member in Room
    }
}
