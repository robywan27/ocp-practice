package chapter6;

/*
* super reference
* The super reference is used to refer to the members on the parent class.
* When a variable or method is defined in both the parent and child class, the instance holds two copies of them with
* the same underlying name. (This is called hiding a variable).
* Can be used similarly to this, except super excludes any member found in the current class
* */
public class Reptile {
    protected int speed = 10;
}

class Crocodile extends Reptile {
    protected int speed = 20;
    public int getSpeed() {
        return speed; // returns this class's property <- most granular scope
    }
    public int getParentSpeed() {
        return super.speed;
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed()); // 20
        System.out.println(croc.getParentSpeed()); // 10
    }
}
