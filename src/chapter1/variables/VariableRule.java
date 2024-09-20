package chapter1.variables;

public class VariableRule {
    String zooName = "Initializing a variable"; // initializing a variable, i.e. assigning a value to teh variable

    /*Rules to assign valid names to identifiers
    * An identifier is the name of a variable, method, class, interface, package
    * */
    long ok; // start with a letter
    String _aVariable; // start with an underscore
    double $price; // start with a currency symbol
    double €price;
    double złprice;
    double ¥price;
    int asd$reqw;
    String __a_var_____;
//    String @email; // any other special symbol is not allowed
//    int &a; // invalid
//    int asd*re; // invalid

    int value2; // numbers can be included
//    int 3DModel; // cannot start with a number

//    int _; // single underscore is not allowed
    int $;

//    int const; // cannot use a reserved keyword
//    int final; // invalid
//    String switch = ""; // invalid

    /*Conventions*/
    String useCamelCase;
    String shouldusecamelcase;
    String should_use_camelcase;
    String USE_LOWERCASE; // unless it's a constant or enum
    final String CONST_VALUE = "Constant value";
    class AValidClassName {}
    class capitalizeFirstLetter {}
}
