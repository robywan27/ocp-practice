package chapter7.reviewexercises;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }
    protected class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }
    public static void main(String... haunt) {
        var g = new Ghost().new Spirit() {
            @Override
            public void boo() {
                System.out.println("Booooooooo!!!");
            }
        };
        new Ghost().boo(); // Not scared
        g.boo(); // Booo!!!
    }
}
