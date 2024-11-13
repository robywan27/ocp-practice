package chapter5.overloading;

/*
* Overloading methods:
* occurs when methods in the same class have the same name but different method signatures, i.e. different param lists
* anything else, except the name, can differ: access modifiers, specifiers, return types, exception lists
* */
public class Falcon {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}
}
