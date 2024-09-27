package chapter3.loop;

/*
* do {
*   body
* } while (boolExpr); // semicolon required
*
* do/while loop guarantees the body to be executed at least once, unlike while.
* */
public class DoWhileStatement {
    public static void main(String[] args) {
        int lizard = 0;
        do {
            lizard++; // executed once regardless of bool expr
        } while (false); // executed after body is executed
        System.out.println(lizard); // 1
    }
}
