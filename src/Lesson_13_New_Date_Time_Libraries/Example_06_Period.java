package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.Period;

public class Example_06_Period {
    public static void main(String[] args) {
        // Period represents time period b/w two dates or datetimes:
        // no period b/w two LocalTimes
        LocalDate ld1 = LocalDate.of(2020, 12, 2);
        LocalDate ld2 =  LocalDate.of(2020, 12, 30);
        Period p = Period.between(ld1, ld2); // doesn't include ld2
        System.out.println("between: " + p);

        System.out.println("until: " + ld1.until(ld2));
        System.out.println("getDays: " + p.getDays());
        System.out.println("getMonths: " + p.getMonths());
        System.out.println("getYears: " + p.getYears());
        System.out.println("getUnits: " + p.getUnits());

        System.out.println("\ninstantiations: ");
        Period p2 = Period.ofDays(10);
        System.out.println("period of 10 days: " + p2.getDays());

        Period p3 = Period.ofYears(20);
        System.out.println("period of 20 years: " + p3.getYears());
        System.out.println("period of 20 years in months: " + p3.toTotalMonths());

    }
}
