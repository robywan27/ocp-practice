package chapter3.branching;

/*
* optionalLabel: while (boolExpr) {
*   body
*   break optionalLabel; // semicolon required
* }
*
* In switch statements, it transfers the flow of control out to the enclosing statement.
* In loops, it ends the loop early.
* Without optional label, break terminates to the nearest inner loop it's in the process of executing
* */
public class BreakStatement {
    public static void main(String[] args) {
        int[][] list = {{1,13}, {5,2}, {2,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP: for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP; // breaks out of the entire nested loop structure
                }
            }
        }
        if (positionX == -1 || positionY == -1)
            System.out.println("Value " + searchValue + " not found");
        else System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")"); //
        // Value 2 found at: (1, 1)

        PARENT_LOOP: for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break; // breaks out of the inner loop only
                }
            }
        }
        System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")"); //
        // Value 2 found at: (2, 0)
    }
}
