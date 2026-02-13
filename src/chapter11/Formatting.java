package chapter11;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("###,###.##");
        NumberFormat compactFormatter = NumberFormat.getCompactNumberInstance();
        var compactFormatter2 = NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG);
        NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.GERMANY);

        System.out.println(formatter.format(1234.567)); // 1,234.57
        System.out.println(compactFormatter.format(1234.567)); // 1K
        System.out.println(percentFormatter.format(1234.567)); // 123.457 %
        try {
            System.out.println(formatter.parse("1,234.57")); // 1234.57
        } catch (Exception e) {
            e.printStackTrace();
        }

        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.ITALY);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.JAPAN);
        var date = LocalDate.of(2024, 6, 1);
        var time = LocalTime.of(14, 30);
        var dateTime = LocalDateTime.of(date, time);
        var zonedDateTime = dateTime.atZone(java.time.ZoneId.systemDefault());

        System.out.println(dateFormatter.format(date)); // 01/06/2024
        System.out.println(timeFormatter.format(time)); // 14:30
        System.out.println(dateTimeFormatter.format(dateTime)); // 2024/06/01 14:30:00


//        ResourceBundle resourceBundle = ResourceBundle.getBundle("chapter11.Formatting", Locale.getDefault());
//        System.out.println(resourceBundle.getString("greeting")); // Hello, World!
//        resourceBundle.keySet().forEach(System.out::println);

        Properties properties = new Properties();
        properties.setProperty("greeting", "Hello, World!");
        System.out.println(properties.getProperty("greeting")); // Hello, World!
        System.out.println(properties.getProperty("greeting", "default value")); // Hello, World!
        System.out.println(properties.get("greeting")); // Hello, World!
    }
}
