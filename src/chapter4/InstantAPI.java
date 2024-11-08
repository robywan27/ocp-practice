package chapter4;

import java.time.*;

// represents a specific moment in time in the GMT time zone
public class InstantAPI {
    public static void main(String[] args) {
        var now = Instant.now();
        System.out.println(now); // 2024-11-08T09:42:44.100158Z - of course it's different every time it's called

        // get Instant from a ZonedDateTime; not possible with LocalDateTime
        var date = LocalDate.of(2024, 12, 3);
        var time = LocalTime.of(5, 4, 22, 33333);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(zonedDateTime); // 2024-12-03T05:04:22.000033333-05:00[US/Eastern]
        var instant = zonedDateTime.toInstant(); // removes the time zone and changes time to GMT zone
        System.out.println(instant); // 2024-12-03T10:04:22.000033333Z
    }
}
