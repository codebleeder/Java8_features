package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class Example_05_Sum_Avg {
    public static void main(String[] args) {
        int sumOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
        System.out.println(sumOfNotebooks);

        int sumOfNotebooks2 = StudentDataBase.getAllStudents()
                .stream().mapToInt(Student::getNoteBooks).sum();
        System.out.println(sumOfNotebooks2);

        // averagingInt:
        double avgOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
        System.out.println(avgOfNotebooks);
    }
}
