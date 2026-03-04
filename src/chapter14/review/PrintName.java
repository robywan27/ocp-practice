package chapter14.review;

import java.io.IOException;
import java.io.Writer;

public class PrintName {
    public static void main(String[] args) throws IOException {
        String line;
        var c = System.console();
        Writer w = c.writer(); // can throw NullPointerException if console is not available, for example when running in an IDE
        try (w) {
            if ((line = c.readLine("Enter your name: ")) != null) {
                w.append(line); // append() writes to the console; it can throw IOException
            }
            w.flush();
        }
    }
}
