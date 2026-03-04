package chapter14.review;

import java.io.*;

public class CopyFiles {
    public static void copyFile(File file1, File file2) throws IOException {
        var reader = new InputStreamReader(new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[5];
            while (reader.read(buffer) != -1) {
                writer.write(buffer); // ABCDEFBCDE is written in file2 because the buffer is not cleared after each read.
                // At second iteration read() overwrites the buffer starting from index 0 while keeping the rest of the array untouched
            }
        }
    }

    public static void main(String[] args) throws IOException {
        var file1 = new File("src/chapter14/review/file1");
        var file2 = new File("src/chapter14/review/file2");
        copyFile(file1, file2);
    }
}
