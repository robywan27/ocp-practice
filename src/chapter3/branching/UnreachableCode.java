package chapter3.branching;

// Any code placed after a break, continue or return statement is unreachable and program fails to compile
public class UnreachableCode {
    public static void main(String[] args) {
        int checkDate = 0;
        while (checkDate < 10) {
            checkDate++;
            if (checkDate > 100) {
                break;
//                checkDate++; // unreachable
            }
        }

        int hour = 2;
        switch (hour) {
            case 1:
                return;
//                hour++; // unreachable
            case 2:
        }
    }
}
