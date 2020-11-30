package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Example_12_Format_Parse_LocalDate {
    public static void main(String[] args) {
        // parse local date:
        String strDate = "2018-04-18";
        LocalDate ld1 = LocalDate.parse(strDate);
        System.out.println("parse local date: " + ld1);
        System.out.println("using formatter: " + LocalDate.parse(strDate, DateTimeFormatter.ISO_LOCAL_DATE));

        String strDate2 = "20180428"; //yyyyMMdd
        LocalDate ld2 = LocalDate.parse(strDate2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("basic iso date: " + ld2);

        // custom defined date format:
        String strDate3 = "2018|04|28";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate ld3 = LocalDate.parse(strDate3, dtf);
        System.out.println("custom format: " + ld3);

        // format local date:
        LocalDate ld4 = LocalDate.now();
        System.out.println("format using formatter: " + ld4.format(dtf));
        System.out.println("basic iso date: " + ld4.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
