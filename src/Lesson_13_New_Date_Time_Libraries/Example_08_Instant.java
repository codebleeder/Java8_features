package Lesson_13_New_Date_Time_Libraries;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;

public class Example_08_Instant {
    public static void main(String[] args) {
        // represents time in a machine readable format:
        // represents seconds from EPOCH: Jan 01 1970 to current time
        Instant instant = Instant.now();
        System.out.println("instant: " + instant);
        System.out.println("epoch seconds: " + instant.getEpochSecond());
        System.out.println("first second of epoch: " + Instant.ofEpochSecond(0));
        System.out.println("duration: " + Duration.between(instant, Instant.now()).getNano());
    }
}
