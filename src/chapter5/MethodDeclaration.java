package chapter5;

public class MethodDeclaration {
    /*
    * A method declaration is composed of the following elements:
    * 1. access modifiers (not required)
    * 2. specifiers (optional)
    * 3. return type
    * 4. method name
    * 5. parameter list
    * 6. exception (optional)
    * 7. method body
    *
    * method signature: method name + parameter list - how callers reference a method
    * return type + access modifiers - where the method can be referenced
    * */
    public final void nap(int minutes) throws InterruptedException {
        // take a nap
    }

    /*
    * 1. Access modifiers
    * - private - (method) accessible only within class
    * - package access (no keyword) - accessible by classes within package
    * - protected - accessible in package and subclasses
    * - public - accessible everywhere
    * */


    /*
    * 2. (optional) specifiers
    * Possible to have multiple specifiers in the same method, but not all combinations are legal
    * - static
    * - abstract
    * - final
    * - default
    * - synchronized
    * */

    // access modifiers and specifiers can appear in any order.
    // Then follows in this order: return type, name, param list, exceptions, body


    /*
    * 3. Return type
    * - Return a Java type or your own type -> requires a return statement inside the method body of matching type
    * - If no return type, then void -> return is optional
    * */
    String hike(int a) {
        if (1 < 2) return "orange"; // needs a return statement for false condition. Doesn't matter if condition
        // always evaluates like in this case!
        return "apple";
    }

//    int getHeight() {
//        long temp = 9L;
//        return temp; // return value needs to be assignable to the return type
//    }


    /*
    * 4. Method name
    * They follow the same rules as variable names.
    * - can only contain letters, numbers, currency symbols and _
    * - reserved words are not allowed
    * - first character cannot be a number
    * - _ alone is not allowed
    * */


    /*
    * 5. Parameter list
    * Required but doesn't need to contain any parameter.
    * Params are separated by comma.
    * */


    /*
    * 6. Method signature
    * Method name + parameter list.
    * It's used by Java to uniquely determine which method is being called.
    * It is followed by determining if the call is allowed (access modifier and return type).
    * Param list is about the types and order. Names of the params are not part of the signature!
    * */
    public void visitZoo(String name, int waitTime) {}
//    public void visitZoo(String attraction, int rainFall) {} // invalid - has same signature as line above
    public void visitZoo(int rainFall, String attraction) {} // different order is ok


    /*
    * 7. Exception list
    * Can list as many exceptions as you want, separated by commas.
    * While optional exceptions might be required by compiler based on content of method body
    * */


    /*
    * 8. Method body
    * It's a code block; can contain zero or more statements.
    * It's required, unless method is declared abstract
    * */
}
