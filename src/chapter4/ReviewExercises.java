package chapter4;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class ReviewExercises {
    public static void main(String[] args) {
        // exercise 3.
        var zone = ZoneId.of("US/Eastern");
        var time = LocalTime.of(2, 15);

        var date = LocalDate.of(2022, 3, 13); // time springs forward
        var date2 = LocalDate.of(2022, 11, 6); // time falls back
        /*
        it is possible to create a datetime object with time set to 2 even though 2-3 doesn't exist on 13th March.
        Java automatically adjusts for daylight savings time
         */
        var z = ZonedDateTime.of(date, time, zone);
        var z2 = ZonedDateTime.of(date2, time, zone); // no problem here anyway
        System.out.println(z); // 2022-03-13T03:15-04:00[US/Eastern]
        System.out.println(z2); // 2022-11-06T02:15-05:00[US/Eastern]

        // 4.
        var s = "Hello";
        var t = new String(s); // valid way to instantiate a String object
        System.out.println(s == t); // false, different references
        System.out.println(t.intern() == s); // true, they point to the same object in the string pool

        // exercise 15
        var arr = new String[]{"PIG", "pig", "123"};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, "Pippa")); // -3 <- i should be inserted after PI; remember
        // uppercase letters come before lowercase letters


        // exercise 16
        var base = "ewe\nsheep\\t";
        int length = base.length();
        int indent = base.indent(2).length(); // adds 2 spaces at the beginning of each line! + \n at the end
        int translate = base.translateEscapes().length(); // one \ is removed
        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.println(formatted); // 11 16 10


        // exercise 18
        String s1 = """
                purr"""; // equivalent to "purr"
        String s2 = "purr";
        System.out.println(s1.equals(s2));


        // exercise 19. - remember the return values of compare and mismatch for arrays!


        // exercise 20
        var da = LocalDate.of(2022, Month.MARCH, 13);
        var ti = LocalTime.of(1, 30);
        var zo = ZoneId.of("US/Eastern");
        var dt1 = ZonedDateTime.of(da, ti, zo);
        var dt2 = dt1.plus(1, ChronoUnit.HOURS);
        System.out.println(dt1); // 2022-03-13T01:30-05:00[US/Eastern]
        System.out.println(dt2); // 2022-03-13T03:30-04:00[US/Eastern]

        long diff = ChronoUnit.HOURS.between(dt1, dt2); // even though it's 2 hours of difference since dt1 is 1.30
        // and dt2 is 3.30, it counts as one hour later due to daylight savings adjustment
        int hour = dt2.getHour();
        boolean offset = dt1.getOffset() == dt2.getOffset(); // offset changes
        System.out.println("diff = " + diff); // 1
        System.out.println("hour = " + hour); // 3
        System.out.println("offset = " + offset); // false


        // exercise 22
        System.out.println(LocalDate.of(2022, Month.APRIL, 30).getDayOfMonth()); // it is a valid method; something like date.getDay() doesn't exist
    }
}
