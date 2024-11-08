package chapter4;

import java.time.*; // necessary import!
//import java.util.Date; // old library, use more recent API

/*
* Four choices of date and/or time:
* - LocalDate - date, no time and no time zone
* - LocalTime - time, no date and no time zone
* - LocalDateTime - date and time, no time zone
* - ZonedDateTime - date, time, time zone
* */
public class DateTimeAPI {
    public static void main(String[] args) {
        // creation
        // you don't create the object directly via constructor!
        // Factory pattern: private constructor, static public methods that return instances
//        var d = new LocalDate(); // invalid

        // current date/time
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        // specific date/time
        // date
        var date1 = LocalDate.of(2022, Month.JANUARY, 20); // passing Month constant
        var date2 = LocalDate.of(2022, 1, 20);
        // time
        var time1 = LocalTime.of(7, 30);
        var time2 = LocalTime.of(7, 30, 45);
        var time3 = LocalTime.of(7, 30, 45, 200_000);
        // datetime
        var dateTime1 = LocalDateTime.of(date1, time1); // just pass a LocalDate and LocalTime
        var dateTime2 = LocalDateTime.of(2022, Month.JANUARY, 20, 7, 30, 45);
        // other combinations...
        // datetime with zone - it's possible only via the following 3 ways (no Month enum)
        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(dateTime1, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(2022, 1, 20, 7, 30, 45, 200_000, zone);


        // manipulate dates and times
        // date and time classes are immutable!
        var date = LocalDate.of(2022, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time);
        dateTime.plusDays(10); // this doesn't do anything; need to (re-)assign value to be useful

        System.out.println(date); // 2022-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2022-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2022-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2022-02-28 - 2022 is not a leap year, so last day of February is 28
        date = date.plusYears(2);
        System.out.println(date); // 2024-02-28
        date = date.minusWeeks(4);
        System.out.println(date); // 2024-01-31

        System.out.println(dateTime); // 2022-01-20T05:15
        // it is possible to chain methods
        dateTime = dateTime
                .minusDays(1) // 2022-01-19T05:15
                .minusHours(5) // 2022-01-19T00:15
                .minusMinutes(25) // 2022-01-18T23:50 - changes to the day before automatically
                .minusSeconds(30);
        System.out.println(dateTime); // 2022-01-18T23:49:30 - now it displays seconds too

//        date.plusMinutes(10); // LocalDate does not contain time


        // daylight saving time
        // in March, time springs forward from 1:59 a.m. to 3:00 a.m.
        // in November, time falls back from 1:00 a.m. to 1:59 a.m. twice

    }
}
