package chapter5.staticdata;

/*
Class vs instance members access:
A static member cannot call an instance member without referencing an instance of the class.
Two ways to solve this problem:
- make the instance member static and reference it from the static members
- make the static member as an instance member
 */
public class MantaRay {
    private String name = "Sammy"; // you can make this static and reference it from static third()

    public static void first() {}
    public static void second() {}
    public void third() { System.out.println(name); }
//    public static void third() { System.out.println(name); } // making third() static creates the problem of
    // accessing instance property name. Problem goes away if you declare name static

    public static void main(String[] args) {
        first();
        second();
//        third(); // can't access instance method third() from static method main()
        // if you keep third() non-static, then you can reference it via an instance of the class
        MantaRay mantaRay = new MantaRay();
        mantaRay.third(); // Sammy
    }
}
