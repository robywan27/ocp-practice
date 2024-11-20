package chapter6;

/*
* this reference
* Java uses the most granular scope!
* The this reference refers to the current instance of the class and can be used to access any member of the class,
* including inherited members.
* It can be used in any instance method, constructor or instance initializer block.
* It can't be used when there is no implicit instance, i.e. in static methods or static initializer blocks
* */
public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        this.color = color; // sets the property value
    }
    public void setColorWrong(String color) {
        color = color; // color is referred to the param, not the instance var (most granular scope)
    }

    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColorWrong("PINK");
        System.out.println(f.color); // null
        f.setColor("PINK");
        System.out.println(f.color); // PINK
    }
}
