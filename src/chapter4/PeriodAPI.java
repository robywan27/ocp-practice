package chapter4;

import java.time.LocalTime;
import java.time.Period;

public class PeriodAPI {
    public static void main(String[] args) {
        var annually = Period.ofYears(1);
        System.out.println(annually); // P1Y - every year
        var quarterly = Period.ofMonths(3);
        System.out.println(quarterly); // P3M
        var fortnightly = Period.ofWeeks(2);
        System.out.println(fortnightly); // P14D
        var everyOtherDay = Period.ofDays(2);
        System.out.println(everyOtherDay); // P2D
        var everyYearAndAWeek = Period.of(1, 0, 7);
        System.out.println(everyYearAndAWeek); // P1Y7D - month has value 0 therefore it's omitted in string

        // chaining methods isn't allowed, because they are static methods
        var wrong = Period.ofYears(3).ofWeeks(1); // equivalent to assigning Period.ofWeeks(1)
        System.out.println(wrong); // P7D

        // Period can be used only with objects containing a date, so it doesn't work with LocalTime
        var time = LocalTime.of(12, 5);
//        time.plus(everyOtherDay);
    }
}
