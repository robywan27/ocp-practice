package chapter2;

/*Ternary operator: boolExpr ? expr : expr2
* Second and third operands can be any expression that returns a value. Not mandatory that these expressions type be
* the same. However it matters when there's an assignment.
* */
public class TernaryOperator {
    public static void main(String[] args) {
        int owl = 5;
        int food = owl < 2 ? 3 : 4; // 4
        System.out.println(food);

        int food2 = (owl < 4 ? (owl > 2 ? 3 : 4) : 5); // parentheses help with readability, especially with composite
        // ternary operators
        System.out.println(food2); // 5

        // unperformed side effects
        int sheep = 1, zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++; // increment on zzz never occurs
        System.out.println(sheep + "," + zzz); //2,1
    }
}
