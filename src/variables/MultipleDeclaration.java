package variables;

public class MultipleDeclaration {
    String s1, s2, s3; // type must be the same
    int x = 3, y = 5, z = 8;

    public static void main(String[] args) {
        int i, j = 3, k; // only j is initialized
//        System.out.println(i); // i wasn't initialize, so cannot be used
        System.out.println(j);
    }

//    String s, int a; // declarations must share the same type
//    int a, int b; // same type must not be repeated

    int i2; int i3; String s; // each one is a separate statement, same as if they were in new lines
//    int a; b; // different from int a, b;
}
