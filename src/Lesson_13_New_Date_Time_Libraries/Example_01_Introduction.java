package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example_01_Introduction {
    public static void main(String[] args) {
        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
