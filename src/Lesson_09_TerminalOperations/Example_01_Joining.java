package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.stream.Collectors;

public class Example_01_Joining {
    public static void main(String[] args) {
        // version 1:
        String concatenatedNames = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
        System.out.println(concatenatedNames);

        // version 2 - pass delimiter:
        String concatenatedNames2 = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
        System.out.println(concatenatedNames2);

        // version 3 - pass delimiter, prefix and suffix:
        String concatenatedNames3 = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ") "));
        System.out.println(concatenatedNames3);
    }
}
