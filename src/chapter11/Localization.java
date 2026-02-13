package chapter11;

import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale); // en_US

        // no Local constant available for the Netherlands
        Locale.of("nl", "NL");
        var otherLocale = new Locale.Builder()
                .setRegion("NL")
                .setLanguage("nl")
                .build();
        Locale.setDefault(otherLocale);
        System.out.println(Locale.getDefault()); // nl_NL
    }
}
