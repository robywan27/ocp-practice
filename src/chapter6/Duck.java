package chapter6;

public class Duck {
    private String color;
    private int height;
    private int length; // default value for an int instance var is 0

    public void setData(int length, int theHeight) {
        length = this.length; // method param is assigned the (default) value of the property, instead of the other
        // way around
        height = theHeight; // this is optional here because of different names
        this.color = "white";
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.setData(1, 2);
        System.out.println(d.length + " " + d.height + " " + d.color); // 0 2 white
    }
}
