package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Example_02_LocalDate {
    public static void main(String[] args) {
        // now:
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // of:
        LocalDate ld1 = LocalDate.of(2020, 12, 10);
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.ofYearDay(2020, 100);
        System.out.println(ld2);

        // get month and days:
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getMonthValue());
        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfYear());

        // using get():
        System.out.println(ld1.get(ChronoField.DAY_OF_MONTH));

        // modify LocalDate:
        System.out.println(ld1.plusDays(3)); // creates a new instance. All instances are immutable
        System.out.println(ld1.plusMonths(2));

        System.out.println(ld1.minusYears(3));
        System.out.println("with year: " + ld1.withYear(1998));
        System.out.println("with year - temporal: " + ld1.with(ChronoField.YEAR, 1978));
        System.out.println("with temporal adjuster: " + ld1.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("minus with ChronoUnit: " + ld1.minus(1, ChronoUnit.DECADES));

        // other
        System.out.println("check for leapyear: " + ld1.isLeapYear());
        System.out.println("check if 2 dates are equal: " + ld1.isEqual(ld2));
        System.out.println("check if ld1 is before ld2: " + ld1.isBefore(ld2));
        System.out.println("check if ld1 is after ld2: " + ld1.isAfter(ld2));

        // unsupported:
        //System.out.println("subtract time from date: " + ld1.minus(1, ChronoUnit.MINUTES));
        System.out.println("check if minutes is supported: " + ld1.isSupported(ChronoUnit.MINUTES));


    }
}
