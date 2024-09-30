package chapter3;

import java.util.List;

/*Pattern matching
* Technique of controlling program flow that only executes a section of code that meets some criteria.
* It's used in conjunction with if statements.
* Common use case: check if a variable of a certain type and immediately cast it to that type
* */
public class PatternMatching {
    void compareIntegers(Number number) {
        int comparison = 5;
        // no exception thrown because cast operation is executed only if instanceof returns true
        if (number instanceof Integer data) { // data is the pattern variable
            System.out.println(data.compareTo(comparison));
        }
    }

    void printIntegersGreaterThanFive(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) { // filter expression added
            System.out.println(data);
        }
    }

    /*The compiler applies flow scoping with pattern matching
    * Flow scoping: variable is only in scope when the compiler can definitely determine its type.
    * Flow scoping is determined based on the branching and flow of the program.
    * It is not hierarchical! Instance, class and local scoping aren't applicable
    * */
    void printIntegersSmallerThanFive(Number number) {
        // because data could be undefined therefore compiler can't determine if data can be an instance of Integer,
        // data is not in scope, and program doesn't compile
//        if (number instanceof Integer data || data.compareTo(5) < 0) { // no short-circuiting when false as with &&
//            System.out.println(data);
//        }
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.println(data.intValue()); // data is still in scope! Because if you reach this line data is
        // certainly an Integer, therefore in scope

        // This is equivalent
        if (number instanceof Integer data2)
            System.out.println(data2.intValue());
        else
            return;
    }

    public static void main(String[] args) {
        // pattern variable must be a subtype of the variable on the left side of the expression
        Integer value = 2;
        if (value instanceof Integer) {} // no problem
//        if (value instanceof Integer data) {} // pattern variable can't be the same type!
        // NOTE: in JDK21 the previous is no longer valid, a pattern variable is allowed to be of the same type

        // the compiler has limitations on enforcing pattern matching types when mixing classes and interfaces
        Number number = 123;
        if (number instanceof List) {} // compiles even though Number and List are totally unrelated
        if (number instanceof List data) {} // same
    }
}
