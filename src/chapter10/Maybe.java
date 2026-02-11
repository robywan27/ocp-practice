package chapter10;

import java.util.Optional;

public class Maybe {
    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null)); // Optional.empty
        System.out.println(Optional.ofNullable(4)); // Optional[4]
    }
}
