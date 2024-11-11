package chapter4;

import java.time.*;
import java.time.temporal.ChronoUnit;

// used for smaller units of time than Period, i.e. number of days, hours, minutes, seconds, nanoseconds
// it's therefore compatible with objects containing time, so not LocalDate
// A day is stored in hours instead of days
public class DurationAPI {
    public static void main(String[] args) {
        var daily = Duration.ofDays(1);
        System.out.println(daily); // PT24H
        var hourly = Duration.ofHours(1);
        System.out.println(hourly); // PT1H
        var everyTwoMinutes = Duration.ofMinutes(2);
        System.out.println(everyTwoMinutes); // PT2M
        var everySecond = Duration.ofSeconds(1);
        System.out.println(everySecond); // PT1S
        var everyMillis = Duration.ofMillis(1);
        System.out.println(everyMillis); // PT0.001S - for units lower than a second, Duration is stored as
        // fractional seconds
        var everyNano = Duration.ofNanos(1);
        System.out.println(everyNano); // PT0.000000001S

        // no factory method to specify multiple units unlike Period
        var everyHourAndAHalf = Duration.ofMinutes(90);
        System.out.println(everyHourAndAHalf); // PT1H30M

        // factory methods with TemporalUnit (interface implemented only by ChronoUnit)
        var everyThreeSeconds = Duration.of(3, ChronoUnit.SECONDS);
        System.out.println(everyThreeSeconds); // PT3S

        // operations with ChronoUnit
        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 30);
        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
        System.out.println(one.truncatedTo(ChronoUnit.HOURS)); // 05:00
    }
}
