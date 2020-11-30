package Lesson_13_New_Date_Time_Libraries;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Example_07_Duration {
    public static void main(String[] args) {
        // duration is b/w two LocalTime or LocalDateTime
        System.out.println("duration of 3 hours: " + Duration.ofHours(3));
        System.out.println("duration of 3 minutes: " + Duration.ofMinutes(4));

        LocalTime lt1 = LocalTime.of(7, 20);
        LocalTime lt2 = LocalTime.of(8, 20);
        System.out.println("lt1 until lt2 in minutes: " + lt1.until(lt2, ChronoUnit.MINUTES));
        Duration d1 = Duration.between(lt1, lt2);

        System.out.println(d1);
        System.out.println("duration in minutes: " + d1.toMinutes());

    }
}
