package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example_13_Format_Parse_LocalTime {
    public static void main(String[] args) {
        // parse: string -> LocalTime
        System.out.println("parse: String -> LocalTime ");
        String strTime1 = "13:00";
        LocalTime lt1 = LocalTime.parse(strTime1);
        System.out.println("parse: " + lt1);
        System.out.println("iso local time: " + LocalTime.parse(strTime1, DateTimeFormatter.ISO_LOCAL_TIME));

        String strTime2 = "13*00";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime lt2 = LocalTime.parse(strTime2, dtf1);
        System.out.println("custom formatter: " + lt2);

        // format:
        System.out.println("\n\nformat: LocalTime -> formatted String");
        System.out.println("custom formatted: " + LocalTime.now().format(dtf1));
    }
}
