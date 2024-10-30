package chapter4;

/*StringBuilder is not immutable, unlike String, making it a more memory efficient solution for some use cases.
* StringBuilder changes its own state and returns a reference to itself.
* */
public class StringBuilderAPI {
    public static void main(String[] args) {
        // Mutable
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current); // only one String object is created
        System.out.println(alpha); // abc...xyz

        // when using String instead, a new String is instantiated everytime and returned because Strings are immutable
        String beta = "";
        for (char current = 'a'; current <= 'z'; current++)
            beta += current; // a total of 27 String objects are instantiated, most of which eligible to be garbage
        // collected: "", "a", "ab", "abc", .... Only last string "abcde...wxyz" is finally assigned to beta and printed
        System.out.println(beta); // abc...xyz


        // Returns a reference to itself
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // adds text to the end of sb and also returns a reference to sb; nothing is done with it
        StringBuilder same = sb.append("+end"); // appends text to sb and returns a reference to sb; the reference is
        // stored in same -> both sb and same point to the same object and print the same value
        System.out.println(sb); // start+middle+end
        System.out.println(same); // start+middle+end

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println(a); // abcdefg
        System.out.println(b); // abcdefg


        /*Methods*/

        // constructor
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animals");
        StringBuilder sb3 = new StringBuilder(10); // reserves an initial capacity of 10 characters
        sb3.append("1234567890");
        sb3.append("1111111"); // also ok
        System.out.println(sb3); // 12345678901111111


        // common String methods
        String sub = sb2.substring(sb2.indexOf("a"), sb2.indexOf("al")); // String is returned!
        int len = sb2.length();
        char ch = sb2.charAt(6);
        System.out.println(sub + " " + len + " " + ch); // anim 7 s


        // append values
        sb1.append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1); // 1c-true


        // insert data
        // the offset is the index where we want to insert the requested parameter
        var sb4 = new StringBuilder("animals");
        sb4.insert(7, "-"); // animals-
        sb4.insert(0, "-"); // -animals-
        sb4.insert(4, "-"); // -ani-mals-
        
        
        // delete data
        // end index is exclusive
        sb4.delete(1, 4); // --mals-
//        sb4.deleteCharAt(7);
        sb4.deleteCharAt(5); // --mal-
        sb4.delete(2, 100); // -- ; endIndex is flexible 
        System.out.println(sb4);


        // replace portions
        // 1. delete content starting at startInd and ending before endInd
        // 2. new value is inserted in that position
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // 1. pig dirty 2. pigsty dirty
        builder.replace(3, 100, ""); // delete allows to specify an end index beyond length of string
        System.out.println(builder); // pig


        // reverse
        builder.reverse();
        System.out.println(builder); // gip
    }
}
