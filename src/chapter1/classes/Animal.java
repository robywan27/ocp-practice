package chapter1.classes;

// public class Animal {} // this is a valid class declaration with an empty body
// class Animal // note that the top-level type doesn't need to be declared public

// the public class name has to match the file name
public class Animal {
    /* FIELD:
        * access modifier
        * type
        * field name
     */
    String name; // var declaration is invalid for class fields

    /* METHOD:
        * access modifier
        * return type
        * method name
        * parameters
     */
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

// public class Appliance {} // incorrect, only one public type can be defined per file

class Appliance {} // this is valid
