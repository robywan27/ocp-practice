package chapter11;

public class ExceptionTypes {
    public static void main(String[] args) {
        var t = new Throwable();
        var e = new Exception();
        var er = new Error();
        var r = new RuntimeException();

        var animals = new String[0]; // array of size 0
//        animals[0] = "cat"; // ArrayIndexOutOfBoundsException
    }
}
