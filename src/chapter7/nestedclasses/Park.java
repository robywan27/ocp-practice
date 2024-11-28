package chapter7.nestedclasses;

// 2. static nested classes
public class Park {
    static class Ride {
        private int price = 6;
        public String driver;
    }

    String getDriver() {
//        return Ride.driver; // doesn't compile
        return "";
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
    }
}
