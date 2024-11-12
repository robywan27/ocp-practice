package chapter5.accessmodifiers.pond.shore;

public class Bird {
    /*
    * Rules for protected modifier:
    * 1. a member is used via inheritance in a subclass, without referring to a variable -> access allowed
    * 2. a member is used through a variable:
    *   - if the REFERENCE type is a subclass -> access allowed
    *   - if the reference type is not a subclass or the parent class itself, not located in the same package as parent
    * class -> access not allowed
    *   - if the reference type is a subclass, but the code is in a class not extending the parent class -> access not allowed
    * */
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
}
