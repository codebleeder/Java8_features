package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class Example_04_MinBy_MaxBy {
    public static void main(String[] args) {
        // minBy() - get student with least GPA:
        Optional<Student> leastGPA = StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
        System.out.println(leastGPA.get());

        Optional<Student> leastGPA2 = StudentDataBase.getAllStudents()
                .stream().min(Comparator.comparing(Student::getGpa));
        System.out.println(leastGPA2.get());

        // maxBy() - get student with greatest GPA:
        Optional<Student> greatestGPA = StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
        System.out.println(greatestGPA.get());
    }
}
