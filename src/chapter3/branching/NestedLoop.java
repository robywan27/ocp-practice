package chapter3.branching;

public class NestedLoop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t"); // note print here instead of println
            }
            System.out.println();
        }

        // same loop with mixed for-each loop and for loop
        for (int[] line : matrix) {
            for (int x = 0; x < line.length; x++) {
                System.out.print(line[x] + "\t");
            }
            System.out.println();
        }

        // same loop only with for-each
        for (int[] line : matrix) {
            for (int entry : line) {
                System.out.print(entry + "\t");
            }
            System.out.println();
        }

        // something with nexted while statements
        int hungryHippo = 8;
        while (hungryHippo > 0) {
            do {
                hungryHippo -= 2;
            } while (hungryHippo > 5);
            hungryHippo--;
            System.out.print(hungryHippo + ", "); // 3, 0,
        }
    }
}
