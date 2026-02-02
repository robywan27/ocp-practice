package chapter7.records;

/*
* Members automatically added to records
* - constructor: one with params in the same order as the record declaration
* - accessor method: one for each field
* - equals(), hashCode(), toString()
*
* Other properties:
* - records don't define setters
* - records are implicitly final
* - every field is implicitly final
* - can't extend or inherit a record
* - can implement an interface
* */
public final record Crane(int numberEggs, String name) implements A {
    protected static void exampleMethod() { // valid but should declare it private/public/package-accessible because a record can't be extended
        // numberEggs = 5; // not allowed, fields are final
    }
}

interface A {}

class CraneTester {
    public static void main(String[] args) {
        var mommy = new Crane(4, "Cammy");
        System.out.println(mommy);
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        var daddy = new Crane(4, "Cammy");
        System.out.println(mommy.equals(daddy));
    }
}
