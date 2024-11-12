package chapter5.localandinstancevariables;

/*
Instance variable modifiers.
Modifiers allowed: final, volatile, transient.
Final instance variable: specifies that the variable must be initialized with each instance of the class exactly once.
Note: a default value is not applied to final instance variables, that's why it is necessary to initialize them.
 */
public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;

    { fishEaten = 10; } // final instance variable must be assigned a value

    public PolarBear() {
        name = "Roberto"; // final instance variable must be assigned a value
    }
}
