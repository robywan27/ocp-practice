package chapter6;

public class Lion extends Feline {
    protected void setProperties(int age, String n) {
        setAge(age); // can modify private parent's property age
        name = n;
    }
    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!"); // getAge() allows access to age
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kian");
        lion.roar(); // kian, age 3, says: Roar!
    }
}
