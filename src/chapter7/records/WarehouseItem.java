package chapter7.records;

public record WarehouseItem(long id, String name) {
    private static Status status = Status.STORED; // can define static fields
//    private boolean isInWarehouse; // can't add any other instance fields!

    // overloaded constructor that can take a completely different list of params
    public WarehouseItem(int count) {
        this(11111, "#" + count); // only first line to transform data
        // here can only assign values to fields
    }

    @Override public long id() { return 123456789; } // can override any provided method

    // other members can be: nested classes, interfaces, enums. records
    enum Status { STORED, DISPATCHED, DELIVERED }
}
