package chapter6;

public class Feline {
    private int age; // not available in subclasses
    protected String name;
    // getters and setters allow access to private members to other classes
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
}
