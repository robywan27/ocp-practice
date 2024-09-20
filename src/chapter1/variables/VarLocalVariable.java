package chapter1.variables;

/*Local variable type inference
*  - It's applicable only for local chapter1.variables
*  - The compiler infers the type for you
* */
public class VarLocalVariable {
//    var a; // not valid here, it's an instance variable

    public void method() {
        var s = "ciao"; // inferred as String
        var i = 13; // inferred as int
//        var d; // invalid - initialization has to happen at the line variable is declared
//        d = 5;
//        i = "hello"; // invalid, variable's type has been defined statically at declaration
//        var n = null; // invalid - cannot initialize a var with null; if it's a reference type, it can be assigned
        // null at a later time though

        var var = 3; // var is not a reserved keyword, but a reserve type name: it cannot be used to define a type
    }

//    class var {} // invalid
    class Var {} // valid, because Java is case-sensitive

//    void other(var a, var b) {} // invalid - method parameters
}
