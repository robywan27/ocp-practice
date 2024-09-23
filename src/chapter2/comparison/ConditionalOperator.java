package chapter2.comparison;

/*Conditional operators: &&, ||
* Aka short-circuit operators: right side of the expression may never be evaluated if the result can be determined
* from the left operand.
* */
public class ConditionalOperator {
    public static void main(String[] args) {
        System.out.println(false && 4 > 5); // always false, right operand never evaluated
        System.out.println(true || false); // always true, right operand never evaluated

        Integer integer = 2;
        if (integer != null && integer.intValue() < 5)
            System.out.println("printed");
        integer = null;
        if (integer != null && integer.intValue() < 5)
            System.out.println("no NullPointerException thrown"); // not printed, but at least no ex exception is
        // thrown because of short-circuiting

        // unperformed side effect
        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7); // increment is never executed
        System.out.println(rabbit); // 6
    }
}
