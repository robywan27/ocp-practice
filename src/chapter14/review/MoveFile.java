package chapter14.review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveFile {
    public static void main(String[] args) throws IOException {
        Files.move(Path.of("src/chapter14/review/monkey.txt"), Path.of("src/chapter14/review/animals"), StandardCopyOption.ATOMIC_MOVE); // exception is thrown, because animals is a directory
    }
}
