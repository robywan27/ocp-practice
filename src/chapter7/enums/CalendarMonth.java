package chapter7.enums;

public enum CalendarMonth implements Festive { // can implement an interface
    JANUARY {
        public int getNumberOfDays() { return 31; } // implement method getNumberOfDays()
        public boolean isHoliday() {
            return true;
        }
    },
    FEBRUARY {
        public int getNumberOfDays() { return 28; }
        public boolean isHoliday() {
            return false;
        }
    },
    MARCH {
        public int getNumberOfDays() { return 31; }
        public boolean isHoliday() {
            return false;
        }
    };
    // ...
    public abstract int getNumberOfDays();

    // can override method here
//    @Override
//    public boolean isHoliday() {
//        return false;
//    }
}

interface Festive { boolean isHoliday(); }
