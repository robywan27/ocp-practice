package chapter2.comparison;

/*Relational operator: <, <=, >, >=, instanceof
* Compare two expressions and return a boolean value
* */
public class RelationalOperator {
    public static void main(String[] args) {
        /* Operator is applicable only with numeric values (except instanceof). If values aren't of same type, promotion
         * happens according to numeric promotion rules*/
        int humanFeet = 2, dogFeet = 4, tapirFeet = 4;
        System.out.println(humanFeet > dogFeet); // false
        System.out.println(dogFeet >= tapirFeet); // true
        System.out.println(humanFeet < dogFeet); // true
        System.out.println(humanFeet <= dogFeet); // true

        /*instanceof
        * Determines whether an object is a member of a certain class or interface at runtime.
        * Useful because of polymorphism.
        * */
        Integer zooTime = Integer.valueOf(9); // object of type Integer created
        Number num = zooTime; // valid because Integer inherits Number
        Object obj = zooTime; // valid because Integer inherits Object
        System.out.println(zooTime instanceof Integer); // true
        System.out.println(zooTime instanceof Number); // true
        System.out.println(zooTime instanceof Object); // true

        RelationalOperator relational = new RelationalOperator();
        relational.openZoo(zooTime); // 9 o' clock

//        System.out.println(zooTime instanceof String); // incompatible types

        System.out.println(null instanceof Object); // always false
        Object noObject = null;
        System.out.println(noObject instanceof Object); // always null
//        System.out.println(null instanceof null); // invalid
    }

    // instanceof is usually combined with casting. Casting is necessary to get access to fields available only in
    // the sub-classes
    public void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.println((Integer) time + " o'clock"); // casting to narrower type, even though it's not
            // mandatory here
        else System.out.println(time);
    }
}
