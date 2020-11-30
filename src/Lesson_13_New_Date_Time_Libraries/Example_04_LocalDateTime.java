package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Example_04_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local date-time: " + ldt);

        // instantions:
        System.out.println("\ninstantiation methods");
        LocalDateTime ldt2 = LocalDateTime.of(2020, 8, 8, 12, 7, 59, 11111);
        System.out.println("of - yr, month, day, hour, min, sec, nano: " + ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("of(date, time): " + ldt3);

        System.out.println("\ngetting values: ");
        // same methods as in LocalDate and LocalTime
        System.out.println("hour: " + ldt.getHour());
        System.out.println("minute: " + ldt.getMinute());
        System.out.println("day: " + ldt.getDayOfMonth());
        System.out.println("day of week: " + ldt.getDayOfWeek());
        System.out.println("using get(ChronoField): " + ldt.get(ChronoField.DAY_OF_MONTH));

        System.out.println("\nmodify values: ");
        System.out.println("plus hours: " + ldt.plusHours(25));
        System.out.println("minus days: " + ldt.minusDays(4));
        System.out.println("withMonth: " + ldt.withMonth(3));

    }
}
