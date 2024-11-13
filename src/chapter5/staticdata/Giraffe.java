package chapter5.staticdata;

public class Giraffe {
    public void eat(Giraffe g) { // instance method can call all class and instance methods
        allGiraffeComeOut();
        drink();
        g.drink();
    }
    public void drink() {}
    public static void allGiraffeGoHome(Giraffe g) { // class method cannot call instance methods, except via instance
        allGiraffeComeOut();
//        drink(); // not possible
        g.drink(); // possible
    }
    public static void allGiraffeComeOut() {}
}
