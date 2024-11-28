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
//    private int count = 4;
//    protected int i = 1;

    public abstract void getRid(); // 3., 4.
}

abstract class AbstractClass implements Interface {} // if abstract doesn't need to implement the interface

class Class extends AbstractClass implements Interface {
    public void getRid() { // must be public!
        System.out.println("outta the way!!");
    }
}
