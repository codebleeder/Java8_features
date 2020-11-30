package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Example_03_LocalTime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println("local time: " + lt);
        System.out.println("create instance using of: " + LocalTime.of(23,33));
        System.out.println("include seconds and nanoseconds in of: " + LocalTime.of(23,33,34,99));

        // read values:
        System.out.println("hour: " + lt.getHour());
        System.out.println("min: " + lt.getMinute());
        System.out.println("hour using chronofield: " + lt.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay: " + lt.toSecondOfDay());

        // modify values:
        System.out.println("-------------Modify values------------");
        System.out.println("minus by hours: " + lt.minusHours(2));
        System.out.println("minus by ChronoUnit: " + lt.minus(2, ChronoUnit.HOURS));
        System.out.println("plus minutes: " + lt.plusMinutes(45));
        System.out.println("with MIDNIGHT: " + lt.with(lt.MIDNIGHT));
    }
}
