package chapter4;

import java.util.Arrays; // convenient import for operations on arrays

/*
* Are of memory on the heap with space for a designated number of elements.
* It is an ordered list and can contain duplicates.
* Examples: a String is implemented using an array of characters, with methods to deal with characters specifically
* */
public class ArrayAPI {
    public static void main(String[] args) {
        // Creation

        /*
        1.
        specify:
         - type of the array (e.g. int)
         - size of the array (e.g. 3)
        All elements are set to the default value for that type.
        An array is assigned to a reference variable, which points to the array object
         */
        int[] numbers = new int[3];
        System.out.println(numbers[0]); // 0

        boolean[] booleans = new boolean[2];
        System.out.println(booleans[1]); // false

        char[] characters = new char[2];
        System.out.println(characters[0]); // character 0/

        float[] floatingNumbers = new float[3];
        System.out.println(floatingNumbers[2]); // 0.0

        /*
        2.
        specify:
         - all the elements the array starts with (determines the size)
         - type of the array (e.g. int)
         */
        int[] moreNumbers = new int[] {3, 46, 189};
        System.out.println(moreNumbers[1]); // 46
//        System.out.println(moreNumbers[3]); // array index out of bound

        /*
        3.
        specify:
         - all the elements the array starts with
         Called anonymous array, because you don't specify neither type nor size
         */
        int[] moreAndMoreNumbers = {5, 7, 89};
        System.out.println(moreAndMoreNumbers[0]); // 5

        // [] can appear before or after the variable name, with optional spaces. Following are all valid
        int[] animals = new int [3];
        int    [] animal2;
        int []animals3;
        int animals4[]  = new int  []{2, 3, 4, 5};
        int animals5 [];

        // watch out for multiple arrays declarations
        int[] ids, types; // both arrays
        int imprints[], turtles; // first is an array, second is an int var


        /*
        Array can be of any type, including any reference type.
        equals() on arrays does not check equality on values.
         */
        String[] bugs = {"cricket", "beetle"};
        String [] alias = bugs;

        String[] strings = new String[2];
        System.out.println(strings[1]); // null

        class A {}

        A[] as = new A[2];
        System.out.println(as[0]); // null

        // casting
        String[] words = {"book", "computer", "house"};
        Object[] objects = words; // no casting needed, Object is a broader type
        String[] otherWords = (String[]) objects; // casting required, String is a more specific type
//        objects[0] = new StringBuilder(); // compiles but will result in exception at runtime! Because objects points
        // to an array of type String[]


        // use arrays
        System.out.println(words.length); // 3 - note that length is not a method
//        System.out.println(words.length()); // invalid
        System.out.println(words[1]); // computer

        // with a loop
        var fillers = new int[5];
        for (int i = 0; i < fillers.length; i++) {
            fillers[i] = i + 5;
            System.out.println(fillers[i]);
        }


        // sorting
        int[] randomNumbers = {7, 9, 4, 23, 12, 15};
        System.out.println(Arrays.toString(randomNumbers)); // [7, 9, 4, 23, 12, 15]
        Arrays.sort(randomNumbers); // note that it mutates the array! No need to assign to a different array
        // variable. Different from FP way of working
        System.out.println(Arrays.toString(randomNumbers)); // [4, 7, 9, 12, 15, 23]

        String[] stringNumbers = {"10", "9", "200"};
        Arrays.sort(stringNumbers);
        System.out.println(Arrays.toString(stringNumbers)); // [10, 200, 9] - String sorts in alphabetical order


        // searching (binary search)
        // if array is sorted
        //   found -> index of match
        //   not found -> negated index where element should be inserted - 1
        // not sorted -> undefined result
        int[] nn = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(nn, 2)); // 0
        System.out.println(Arrays.binarySearch(nn, 8)); // 3
        System.out.println(Arrays.binarySearch(nn, 1)); // -1 <- 0 - 1
        System.out.println(Arrays.binarySearch(nn, 3)); // -2 <- -1 - 1
        System.out.println(Arrays.binarySearch(nn, 9)); // -5


        // comparing

        /*
        1. compare()
        - equal arrays -> return 0
        - else -> return positive or negative number
         */
        // arrays with one value
//        System.out.println(Arrays.compare(new String[] {"a"}, new char[] {'a'})); // arrays must be of the same type

        System.out.println(Arrays.compare(new int[] {1}, new int[] {1})); // 0 - equal arrays
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); // -1 - first array smaller than second
        System.out.println(Arrays.compare(new int[] {1}, new int[] {0})); // 1 - first array larger than second

        // arrays of different lengths
        System.out.println(Arrays.compare(new int[] {1, 2}, new int[] {1, 2})); // 0 - equal arrays: same length,
        // same values in each spot in the same order
        System.out.println(Arrays.compare(new int[] {1}, new int[] {1, 2})); // -1 - first array is shorter than
        // second array
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); // -1 - same number of elements but element
        // that differs is larger in the second array
        System.out.println(Arrays.compare(new int[] {1, 2}, new int[] {1})); // 1 - first array is longer
        System.out.println(Arrays.compare(new int[] {2}, new int[] {1})); // 1 - element that differs is larger in
        // first array
        System.out.println(Arrays.compare(new String[] {"a"}, new String[] {null})); // 1 - null is smaller than any
        // value
        System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"aa"})); // -1 - first element is a
        // prefix of the second
        System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"A"})); // positive number - uppercase is
        // smaller than lowercase
        System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"1"})); // positive number - in Strings/characters,
        // numbers are smaller than letters

        /*
        2. mismatch()
        - equal arrays -> return -1
        - else -> return first index where they differ (i >= 0)
         */
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); // -1 - equal arrays
        System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"})); // 0 - arrays differ at index 0
        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1})); // 1 - arrays differ at index 1


        /*
        Multidimensional arrays
         */

        // creation
        int[][] multi; // most common way to initialize a 2D array
        int multi2 [][]; // also possible
        int[] multi3[]; // also possible
        int[] plane [], space [][]; // can initialize different sized arrays on the same line: first is 2D array,
        // second is 3D

        String[][] rectangle = new String[2][3]; // with size specified
        rectangle[0][1] = "Set"; // initialize first element of first array; the other elements of the array remain
        // null for now

        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}}; // can define an asymmetric (non-rectangular) shaped array
        int[][] asym = new int[4][]; // alternatively can first define first dimension
        asym[0] = new int[5]; // then the size of each sub-array
        asym[1] = new int[3];


        // using
        var twoD = new int[3][2];
        System.out.println();
        // looping
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.println(twoD[i][j]); // print default int value 0
            System.out.println();
        }
        // looping wit enhanced loop
        for (int[] row : twoD) {
            for (int element : row)
                System.out.println(element);
            System.out.println();
        }
    }

    // methods with varargs
    void method(String... params) {} // params can be used as a regular array
}
