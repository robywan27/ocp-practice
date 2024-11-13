package chapter5.passdataamongmethods;

/*
* Pass-by-value - argument:
* a copy of a variable is passed to the method
* assignments made in the method do not affect the caller
* */
public class LuckyNumber {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num); // 4
    }

    public static void newNumber(int num) { // param name has no influence on main
        num = 8; // this assignment doesn't affect the variable num in main
    }
}
