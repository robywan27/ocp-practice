package chapter3.branching;

/* Label
* Optional pointer to the head of a statement that allows the app flow to jump to it or break from it.
* Follow the same rules as identifiers.
* Commonly expressed in uppercase in snake_case.
* Mostly useful in nested structures.
* */
public class Label {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}};

        OUTER_LOOP: for (int[] line : matrix) { // here label doesn't add anything
            INNER_LOOP: for (int x = 0; x < line.length; x++) { // same here
                System.out.print(line[x] + "\t");
            }
            System.out.println();
        }
    }
}
