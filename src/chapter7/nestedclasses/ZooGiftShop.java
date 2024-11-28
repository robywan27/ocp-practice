package chapter7.nestedclasses;

// 4. anonymous classes
public class ZooGiftShop {
    abstract class SaleTodayOnly { // same if it is an interface
        abstract int eurosOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int eurosOff() {
                return 3;
            }
        }; // mandatory semicolon
        return basePrice - sale.eurosOff();
    }

    interface Climb {}
    Climb climbing = new Climb() {}; // an anonymous class can be defined outside a method
}
