package chapter7;

public class Rodent {}

class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
//        var capybara = (Capybara) rodent; // object of type superclass cannot be cast to subclass type

        Capybara capybara = new Capybara();
        var rodent2 = (Rodent) capybara;
    }
}
