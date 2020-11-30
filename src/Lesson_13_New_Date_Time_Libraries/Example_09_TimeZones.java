package Lesson_13_New_Date_Time_Libraries;

import java.time.*;

public class Example_09_TimeZones {
    public static void main(String[] args) {
        // ZonedDateTime, ZoneID, ZoneOffset
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zoned date time: " + zdt);
        System.out.println("offset: " + zdt.getOffset());
        System.out.println("zoneID: " + zdt.getZone());
        //System.out.println("list of zoneIDs: " + ZoneId.getAvailableZoneIds());
/*
        ZoneId.getAvailableZoneIds()

                .stream()
                .forEach(System.out::println);
        */
        System.out.println("total zones: " + ZoneId.getAvailableZoneIds().size());
        System.out.println("now in CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("now in EST: " + ZonedDateTime.now(ZoneId.of("America/New_York")));

        System.out.println("\nusing Clock:");
        System.out.println("using clock: " + ZonedDateTime.now(Clock.system(ZoneId.of("America/New_York"))));
        // LocalDateTime won't have Zone information:
        System.out.println("using LocalDateTime: " + LocalDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("using LocalDateTime and Clock: " + LocalDateTime.now(Clock.system(ZoneId.of("America/New_York"))));
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("using system default zone id: " + ldt);
    }
}
