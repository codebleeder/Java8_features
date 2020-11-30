package Lesson_13_New_Date_Time_Libraries;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example_14_Format_Parse_LocalDateTime {
    public static void main(String[] args) {
        System.out.println("parse: String to LocalDateTime: ");
        String dt1 = "2018-04-18T14:33:33";
        LocalDateTime ldt1 = LocalDateTime.parse(dt1);
        System.out.println("normal parse: " + ldt1);

        LocalDateTime ldt2 = LocalDateTime.parse(dt1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("using formatter: " + ldt2);

        String dt2 = "2018_04_18TIME14*33*33";
        DateTimeFormatter customDTF = DateTimeFormatter.ofPattern("yyyy_MM_dd'TIME'H*mm*ss");
        LocalDateTime ldt3 = LocalDateTime.parse(dt2, customDTF);
        System.out.println("custom formatter: " + ldt3);

        System.out.println("\n\nformat: LocalDateTime to formatted String: ");
        LocalDateTime ldt4 = LocalDateTime.now();
        System.out.println("custom format: " + ldt4.format(customDTF));
        System.out.println("normal format: " + ldt4.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
