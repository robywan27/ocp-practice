package chapter7;

/*
* Interface member types
* 1. constant variables
* 2. abstract methods
* 3. default methods
*   a. can be declared only within an interface
*   b. must include a method body
*   c. is implicitly public
*   d. cannot be marked abstract, final or static
*   e. may be overridden by a class implementing the interface
*   f. if a class inherits two or more default methods with the same signature, then the class must override the method
* 4. static methods
*   a. must include a method body
*   b. is implicitly public
*   c. cannot be marked abstract or final
*   d. it is not inherited and cannot be accessed in a class implementing the interface without a reference to the
* interface name
* 5. private methods
*   a. must include a method body
*   b. may only be called by default and other non-static methods within the interface definition
* 6. private static methods
 *  a. must include a method body
 *  b. may be called by any method within the interface definition
* */
public interface CanFly {
    int numberOfWings = 2; // 1.
    boolean hasWings(); // 2.
    default int getNumberOfWings() { // 3. - body is required
        return 2;
    }
    default int getAltitude() { return 10; } // 3.
    public default int getSpeed() { return 5; } // 3.
    static int getHighestAltitude() { // 4.
        return 1000;
    }
    private int checkCorrectness() { return hasWings() ? 0: 1; } // 5.
    private static void printHighestAltitude() { // 6.
        System.out.println(getHighestAltitude());
    }
}

interface CanWalk {
    public default int getSpeed() { return 1; }
}

class Bird implements CanFly {
   public boolean hasWings() {
       return true;
   }

   // can decide to not implement default method

   public int printMaxAltitude() {
       return CanFly.getHighestAltitude() - getAltitude(); // must declare an explicit reference to the name of the interface
   }
}

class Butterfly implements CanFly {

    @Override
    public boolean hasWings() {
        return true;
    }

    public int getNumberOfWings() { // can override default method (remember to use public modifier!)
        return 8;
    }
}

class Insect implements CanFly, CanWalk {

    @Override
    public boolean hasWings() {
        return true;
    }

    @Override
    public int getSpeed() {
        return CanFly.super.getSpeed(); // access default method defined in CanFly!
    }
}
