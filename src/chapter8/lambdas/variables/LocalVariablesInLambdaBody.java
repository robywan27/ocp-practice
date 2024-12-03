package chapter8.lambdas.variables;

import java.util.function.BinaryOperator;

public class LocalVariablesInLambdaBody {
    public static void main(String[] args) {
        BinaryOperator<Integer> lambda = (a, b) -> { int c = 0; return 5; }; // possible to create a local variable
        // inside lambda body

//        BinaryOperator<Integer> lambda2 = (a, b) -> { int a = 0; return 5; }; // can't create a local variable with
//        the same name as one already declared in that scope!
    }
}
