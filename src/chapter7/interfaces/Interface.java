package chapter7.interfaces;

/*
* Implicit modifiers
* 1. interfaces are implicitly abstract
* 2. interface variables are implicitly public, static, final
* 3. interface methods without a body are implicitly abstract
* 4. interface methods without the private modifier are implicitly public
* */
abstract interface Interface { // 1.
    public static final int property = 3; // 2.
    // can't define any other modifier than public for variables.
    // Interface variables are implicitly constants (public immutable and accessible without an instance of the type)
//    private int count = 4;
//    protected int i = 1;

    public abstract void getRid(); // 3., 4.

    // methods have neither protected nor package modifiers
//    protected void invalid(); // invalid modifier
    private void doNothing() {} // if method is private then it needs a body
}

abstract class AbstractClass implements Interface {} // if abstract doesn't need to implement the interface

class Class extends AbstractClass implements Interface {
    public void getRid() { // must be public!
        System.out.println("outta the way!!");
    }
}
