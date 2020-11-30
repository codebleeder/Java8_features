package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example_05_ConversionBwTypes {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = ld.atTime(13, 23);
        System.out.println("LocalDate to LocalDateTime: " + ldt);

        LocalTime lt = LocalTime.of(23, 39);
        LocalDateTime ldt2 = lt.atDate(ld);
        System.out.println("LocalTime to LocalDateTime: " + ldt2);

        System.out.println("LocalDateTime to LocalDate: " + ldt.toLocalDate());
        System.out.println("LocalDateTime to LocalTime: " + ldt.toLocalTime());
    }
}
