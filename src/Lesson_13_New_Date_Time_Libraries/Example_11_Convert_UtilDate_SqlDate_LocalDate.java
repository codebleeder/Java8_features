package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Example_11_Convert_UtilDate_SqlDate_LocalDate {
    public static void main(String[] args) {
        Date utilDate = new Date();
        // Util.Date to LocalDate
        System.out.println("Util.Date: " + utilDate);
        LocalDate ld = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate: " + ld);
        // LocalDate to Util.Date:
        Date utilDate2 = new Date().
                from(ld.
                        atTime(LocalTime.now()).
                        atZone(ZoneId.systemDefault()).
                toInstant());
        System.out.println("utilDate2: " + utilDate2);
        // Sql.Date to LocalDate
        System.out.println("\nSQL date:");
        java.sql.Date sqlDate = java.sql.Date.valueOf(ld);
        System.out.println("LocalDate to sqlDate: " + sqlDate);
        System.out.println("sqlDate to LocalDate: " + sqlDate.toLocalDate());
    }
}
