package chapter4;

/*String
* Sequence of characters, indexed from 0.
* Reference type.
* It's immutable -> calling a method on a String returns a different String object rather than changing the value of
* the reference.
* */
public class StringAPI {
    public static void main(String[] args) {
        String newString = new String("Imma new string"); // can use regular object constructor
        String newString2 = "Imma new string"; // Java provides special way to construct strings
        String textBlock = """
                Fluffy"""; // another special way to construct strings, specific for text blocks


        /*concatenation: +
        * 1. if both operands are numeric, + is addition
        * 2. if either operand is a String, + is concatenation
        * 3. the expression is evaluated left to right
        * */
        System.out.println(2 * 3); // 1. 6
        System.out.println("z" + "a"); // 2. "za"
        System.out.println("z" + "a" + 6); // 3. "z" + "a" -> 2. "za"; 2. "za" + 6 = "za6"
        System.out.println(1 + 2 + "g"); // 3. 1 + 2 -> 1. 3; 2. 3 + "g" = "3g"
        System.out.println("c" + 1 + 2); // 3. "c" + 1 -> 2. "c1"; 2. "c1" + 2 = "c12"
        System.out.println("c" + null); // "cnull"
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 1 + 2 = 3; 3 + 3 = 6; 6 + "4" = "64"
        var s = "1";
        s += "2"; // "12"
        s += 3; // "123"
        System.out.println(s); // "123"


        /* Useful methods
         * */
        var name = "animals";

        // length: length()
        System.out.println(name.length()); // 7


        // get a single character: charAt()
        System.out.println(name.charAt(0)); // first char
        System.out.println(name.charAt(6)); // last char
//        System.out.println(name.charAt(7)); // exception - index out of bounds


        // find an index: indexOf()
        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4));  // 4
        System.out.println(name.indexOf("al", 5)); // -1, no exception thrown when match isn't found
//        System.out.println(name.indexOf('a', 4, 3)); // exception


        // substring: substring()
        // optional end index is the index you stop at (exclusive)
        System.out.println(name.substring(3)); // mals
        System.out.println(name.substring(name.indexOf('m'))); // mals
        System.out.println(name.substring(3, 4)); // m, single character
        System.out.println(name.substring(3, 7)); // mals, up to end of string
        System.out.println(name.substring(3, 3)); // empty string
//        System.out.println(name.substring(3, 2)); // exception
//        System.out.println(name.substring(3, 8)); // exception


        // adjust case: toUpperCase(), toLowerCase()
        System.out.println(name.toUpperCase()); // ANIMALS
        System.out.println("aBc3DEf%".toLowerCase()); // abc3def%


        // equality: equals(), equalsIgnoreCase()
        System.out.println(newString == newString2); // false, because this compares whether the references are
        // pointing to the same object
        System.out.println(newString.equals(newString2)); // true, checks whether the two objects contain exactly the
        // same characters in the same order
        System.out.println("abc".equals("ABC")); // false, strings are case-sensitive
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true


        // search for substrings: startsWith(), endsWith(), contains()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("l")); // false
        System.out.println("abc".contains("bc")); // true
        System.out.println("abc".contains("B")); // false
        System.out.println("abc".contains(new StringBuilder("ab"))); // true; StringBuilder implements the CharSequence interface


        // replace values: replace()
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("ab", "AB")); // ABcABc


        // remove whitespace: strip(), trim(), stripLeading(), stripTrailing()
        // for the exam, strip() and trim() are basically equivalent
        System.out.println("abc".strip()); // abc
        System.out.println("\t  a b c\n".strip()); // a b c
        System.out.println("\t  a b c\n".trim()); // a b c
        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length()); // 4


        // work with indentation: indent(), stripIndent()
        // both methods normalize existing line breaks to \n
        // indent() adds a \n at the end if not there; stripIndent() doesn't do that
        var block = """
                a
                 b
                c""";
        var concat = " a\n"
                   + "  b\n"
                   + " c";
        System.out.println(block.length()); // 6: letters, new lines, space before b
        System.out.println(concat.length()); // 9: letters, new lines, space before a, space before c, 2 spaces before b
        System.out.println(block.indent(1).length()); // 10: added one space at beginning of each line and \n at the end
        System.out.println(concat.indent(-1).length()); // 7: removed one space from each line and added \n at the end
        System.out.println(concat.indent(-4).length()); // 6: removes as much (up to 4) white space from each line
        // and add \n at the end
        System.out.println(concat.stripIndent().length()); // 6: removes the same amount of white space from each
        // line so that the first character on the left is not blank; here one space is removed; no \n is added


        // translate escapes: translateEscapes()
        var str = "1\\t2"; // double \\ to escape the backslash
        System.out.println(str); // 1\t2
        System.out.println(str.translateEscapes()); // 1    2


        // check for empty or blank strings: isEmpty(), isBlank()
        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank()); // true


        // format values: format(), formatted()
        // format() is a static method on String, so you call it as String.format(...)
        // %s for String values
        // %d for integer values (int, long)
        // %f foe floating-point values (float, double)
        // %n inserts a line break, using system-dependent line separator
        var surname = "Moss";
        var orderId = 5;
        System.out.println(String.format("Hello %s, order %d is ready", surname, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(surname, orderId));
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n   Score: %f out of %d".formatted(surname, score, total));
        // mixing data types may cause exceptions at runtime!
        //        var invalidStr = "Food: %d tons".formatted(2.0);
        var pi = 3.14159265359;
        System.out.format("[%f]", pi); // [3.141593] prints 6 digits after . by default; last digit is rounded
        System.out.format("[%12.8f]", pi); // [  3.14159265] prints 8 digits after ., and total length of output is 12
        System.out.format("[%012f]", pi); // [00003.141593] prints 6 digits after ., prepend by zeros, total length 12
        System.out.format("[%10.2f]", pi); // [      3.14] prints 2 digits after ., prepend 6 spaces
        System.out.format("[%.3f]", pi); // [3.142] prints 3 digits after ., round up last digit
        System.out.println();


        // method chaining
        String result = " AniMal   ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result); // AnimAl
    }
}
