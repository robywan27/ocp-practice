package chapter3.branching;

/*
* optionalLabel: while(boolExpr) {
*   body
*   continue optionalLabel; // semicolon required
* }
*
* Causes the flow to finish the execution of the current loop iteration.
* Transfers control to the boolean expression that determines if the loop should continue.
* */
public class ContinueStatement {
    public static void main(String[] args) {
        CLEANING: for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2)
                    continue CLEANING; // skip to next iteration of parent loop
                System.out.println("Cleaning: " + stables + "," + leopard);
                // Cleaning: a, 1
                // Cleaning: c, 1
                // Cleaning: d, 1
            }
        }

        CLEANING: for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2)
                    continue; // skip to next iteration of inner loop
                System.out.println("Cleaning: " + stables + "," + leopard);
                // Cleaning: a, 1
                // Cleaning: a, 3
                // Cleaning: c, 1
                // Cleaning: c, 3
                // Cleaning: d, 1
                // Cleaning: d, 3
            }
        }
    }
}
