package chapter2.comparison;

/*Logical operator: &, |, ^
* Applicable to both numeric and boolean data types:
*   - to boolean types: logical operators
*   - to numeric types: bitwise operators
* */
public class LogicalOperator {
    public static void main(String[] args) {
        boolean eyesClosed = true, breathingSlowly = true;
        System.out.println(eyesClosed & breathingSlowly); // true
        System.out.println(eyesClosed | breathingSlowly); // true
        System.out.println(eyesClosed ^ breathingSlowly); // false
    }
}
