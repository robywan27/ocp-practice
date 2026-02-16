package chapter11;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTypes {
    public static void main(String[] args) {
        var t = new Throwable();
        var e = new Exception();
        var er = new Error();
        var r = new RuntimeException();

        var animals = new String[0]; // array of size 0
//        animals[0] = "cat"; // ArrayIndexOutOfBoundsException

        try {
             throw new IOException("This is an IOException");
        }
//        catch (IOException e) { // e already declared
        catch (IOException ioe) {
            System.out.println("Caught IOException: " + ioe.getMessage());
        }

        try(var r1 = new Resource1();
            var r2 = new Resource2();
            var r3 = new Resource3()) {
            System.out.println("Using resources");
        }
        catch (IOException exc) {
            System.out.println("Caught IOException: " + exc.getMessage());
        }
    }

    static class Resource1 implements AutoCloseable {
        @Override
        public void close() { // no need to declare throws Exception or subclass
            System.out.println("Closing resource 1");
//            throw new RuntimeException(); // can throw unchecked exceptions without declaring them
        }
    }

    static class Resource2 implements AutoCloseable {
        @Override
        public void close() throws IOException {
            System.out.println("Closing resource 2");
            throw new FileNotFoundException("Error closing resource 2");
        }
    }

    static class Resource3 implements Closeable { // Closeable extends AutoCloseable
        @Override
        public void close() {
            System.out.println("Closing resource 3");
        }
    }
}
