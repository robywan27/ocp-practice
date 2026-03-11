## Initialization
| Array Type               | Method                                                                         | Description                                                              |
|--------------------------|--------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| One-dimensional arrays   | int[] numbers = new int[10];<br/>int numbers [] = new int[10];                 | defines type and size; all values are initialized to their default value |
|                          | int [] numbers = new int[] {1, 3, 5};<br/>int numbers[] = new int[] {1, 3, 5}; | initialize the array with values; cannot increase the size of the array  |
|                          | int[] numbers = {1, 3, 5};<br/>int numbers[] = {1, 3, 5};                      | anonymous array                                                          |
|                          | int[] ids, types;                                                              | declare two arrays of int                                                |
|                          | int ids[], types;                                                              | declare ids as array and types as int                                    |
|                          | public int count(int... a) {...}                                               | varargs; only with method params                                         |
| Multi-dimensional arrays | String[][] rectangle = new String[3][2];                                       |                                                                          |
|                          | String[] rectangle[] = {{1,2}, {3,4}, {5,6};                                   |                                                                          |
|                          | String asymmetric[][] = {{1,2,3}, {4}, {5,6}};                                 |                                                                          |
|                          | int[][] scores = new int[5][];                                                 |                                                                          |
|                          | int[] biDimensional[], triDimensional[][];                                     |                                                                          |

## Equality
> arr1.equals(arr2); // reference equality, same as arr1 == arr2

## Length
> arr.length; // it's a property! Not a method, so no ()

## Arrays static methods
> available in java.util package

The Arrays class provides multiple overloaded implementations of a method for different types such as int, long, ... so we refer below generically to <type> for type parameter

| Method                                       | Notes                                                                                                                                                                                                                                                                                                     |
|----------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| String toString(<type>[] arr)                |                                                                                                                                                                                                                                                                                                           |
| boolean equals(<type>[] arr1, <type>[] arr2) | checks if the arrays are the same size and contain the same elements                                                                                                                                                                                                                                      |
| void sort(<type>[] arr)                      | sorts the array in ascending order<br/>- sorts Strings in alphabetic order (numbers, uppercase, lowercase)<br/>- for objects it uses the compareTo method                                                                                                                                                 |
| int binarySearch(<type>[] arr, <type> key)   | - sorted array:<br/>&emsp; - target found: return index of match<br>&emsp; - target not found: return -1 - [index where key would be inserted]<br/>- unsorted array: return undefined value                                                                                                               |
| compare(<type>[] a, <type>[] b)              | - n = 0: same length and same values<br/>- n < 0: same elements but second array is longer OR first element that differs is smaller in first array<br/>- n > 0: same elements but first array is longer OR first element that differs is smaller in second array<br/>null is smaller than any other value |
| mismatch(<type>[] a, <type>[] b)             | - -1: if arrays are equal<br/>- n >= 0: return first index where they differ                                                                                                                                                                                                                              |
