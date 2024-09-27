package chapter3.branching;

/*
* Can be used as an alternative to labels and break statements, when fine-grained control of the loop isn't needed.
* Advantages: code is easier to read and debug, and allows encapsulation of logic in an independent function
* */
public class ReturnStatement {
    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] list = {{1,13}, {5,2}, {2,2}};
        int searchValue = 2;
        int[] results = searchForValue(list, searchValue);

        if (results == null) System.out.println("Value " + searchValue + " not found");
        else System.out.println("Value " + searchValue + " found at: " + "(" + results[0] + "," + results[1] + ")");
    }
}
