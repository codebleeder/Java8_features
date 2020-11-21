package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class Example_07_GroupingBy_2 {
    public static void main(String[] args) {
        Map<Integer, Optional<Student>> studentsByGrade = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .collect(
                        groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))
                        )
                );
        System.out.println("student by grade");
        System.out.println(studentsByGrade);

        // without Optional:
        Map<Integer, Student> studentsByGrade2 = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .collect(
                        groupingBy(
                                Student::getGradeLevel,
                                collectingAndThen(
                                       maxBy(Comparator.comparing(Student::getGpa)),
                                       Optional::get
                               )
                        )
                );
        System.out.println("student by grade without optional");
        System.out.println(studentsByGrade2);

        // by least GPA
        Map<Integer, Student> studentsByGrade3 = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .collect(
                        groupingBy(
                                Student::getGradeLevel,
                                collectingAndThen(
                                        minBy(Comparator.comparing(Student::getGpa)),
                                        Optional::get
                                )
                        )
                );
        System.out.println("student by grade without optional ordered by min: ");
        System.out.println(studentsByGrade3);
    }
}
