package Lesson_13_New_Date_Time_Libraries;

import java.time.*;

public class Example_10_Convert_Instant_ZonedDateTime_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime to ZonedDateTime:
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime: " + ldt);
        ZonedDateTime zdt = ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println("converted zoned dateTime: " + zdt);

        // Instant to ZoneDateTime:
        Instant instant = Instant.now();
        ZonedDateTime zdt2 = instant.atZone(ZoneId.of("America/New_York"));
        System.out.println("instant to zoned: " + zdt2);

        OffsetDateTime odt =  ldt.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("OffsetDateTime: " + odt); // doesn't include zoneId
    }
}
