package variables;

public class VariableScope {
    /*Class variable scope: from declaration until the program ends*/
    final static int MAX_LENGTH = 5;

    /*Instance variable scope: from declaration until the object is eligible for garbage collection*/
    int length = 3;

    /*Local variable scope: from declaration to the end of the block
    *   Method parameter scope: duration of the method
    * */
    public void eatIfHungry(boolean hungry) { // method parameter, in scope until line 16
        if (hungry) { // new block -> new scope
            int bitesOfCheese = 1; // local variable, in scope until line 14
            { // new block
                var teenyBit = true; // local variable, in scope until line 13
                System.out.println(bitesOfCheese);
            }
//            System.out.println(teenyBit); // teenyBit is out of scope
        }
//        System.out.println(bitesOfCheese); // out of scope
        System.out.println(hungry);
        System.out.println(length);
    }
}
