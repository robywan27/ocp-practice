package variables;

/*
* - Garbage collector: process on the JVM that looks for objects that aren't needed anymore
* - Garbage collection: process of automatically freeing memory on the heap by deleting objects that are no longer
* reachable in a program
* - Heap, or free store: large pool of unused memory allocated to your Java application. All objects are stored in
* the program's heap
* - eligible for garbage collection: object's state of no longer being accessible in a program. This occurs when:
*   - object has no longer any reference pointing to it
*   - all references to the object have gone out of scope
*
* You can determine when an object is eligible for GC, but not when it is actually going to be collected
* */
public class ObjectDestruction {
    public static void main(String[] args) {
        String one, two; // two references
        one = new String("a"); // reference one is assigned object a
        two = new String("b"); // reference two is assigned object b
        one = two; // reference one now points to object b
        String three = one; // new reference three refers to object b
        one = null; // reference one doesn't point to object b anymore

        // Two ob projects in the program:
            // object a becomes eligible for GC once reference one points to object b (line 20)
            // object b doesn't go out of scope until the end of the method
    }
}
