package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFiles {
    public static void main(String[] args) throws IOException {
        System.out.println("Working Directory = " + System.getProperty("user.dir")); // absolute path: /.../java/ocp-practice
        // if source path doesn't exist NoSuchFileException is thrown
        // if bamboo.txt exists inside panda_save then FileAlreadyExistsException is thrown
//        Files.copy(Path.of("src/chapter14/temp/panda/bamboo.txt"), Path.of("src/chapter14/temp/panda_save/bamboo.txt"));
        // override file if it already exists
        Files.copy(Path.of("src/chapter14/temp/panda/bamboo.txt"), Path.of("src/chapter14/temp/panda_save/bamboo.txt"), StandardCopyOption.REPLACE_EXISTING);

//        Files.copy(Path.of("src/chapter14/temp/food.txt"), Path.of("src/chapter14/temp/enclosure")); // exception if file enclosure already exists or creates a file enclosure with content of food.txt
        Files.copy(Path.of("src/chapter14/temp/food.txt"), Path.of("src/chapter14/temp/enclosure/food.txt")); // copies food.txt into enclosure directory
    }
}
