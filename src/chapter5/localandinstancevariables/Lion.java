package chapter5.localandinstancevariables;

import chapter1.classes.Animal;

public class Lion {
    int hunger = 4; // instance variable

    public int feedZooAnimals() {
        int snack = 0; // local variable
        if (snack > 4) {
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }

    /*
    Local variable modifiers.
    Only final is applicable to local variables.
     */
    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest; // not necessary to assign a value at declaration
        if (isWeekend) rest = 5; else rest = 20; // however a value must be assigned before
        System.out.println(rest); // it is used

        final var giraffe = new Animal();
        final int[] friends = new int[5];

//        rest = 10; // primitive variable - value cannot be modified
//        giraffe = new Animal(); // reference variable - reference cannot be modified
//        friends = null; // same as previous line
        giraffe.setName("Georgina"); // value can be modified
        friends[2] = 2; // same
    }

    /*
    * Effectively final variables:
    * when a local variable is not modified after it is assigned, regardless of whether it is specified as final
    * */
    public String zooFriends() {
        String name = "Harry Hippo";
        var size = 10;
        boolean wet;

        if (size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }
}


