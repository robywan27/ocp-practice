package chapter6.constructors;

public class Bunny {
    public Bunny() {
        System.out.println("hop");
    }
//    public Bunny(var food) {} // var is not allowed as constructor's param
//    public bunny() {} // must have capital letter, compiler thinks it's a method without return type
    public void Bunny() {} // recognized as just a method
}
