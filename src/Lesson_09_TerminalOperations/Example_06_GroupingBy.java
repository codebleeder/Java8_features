package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class Example_06_GroupingBy {
    public static void main(String[] args) {
        // group by gender:
        Map<String, List<Student>> studentsByGender = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentsByGender);

        // group by GPA; customized grouping:
        Map<String, List<Student>> studentsByGPA = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(s -> s.getGpa() >= 3.9 ? "outstanding" : "average"));
        System.out.println(studentsByGPA);

        // two-level grouping:
        // collect(groupingBy(classifier, downstream)):
        Map<Integer, Map<String, List<Student>>> studentsByGradeAndGPA = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(s -> s.getGpa() >= 3.9 ? "outstanding" : "average")));
        System.out.println(studentsByGradeAndGPA);

        Map<Integer, Integer> gradeLevelToBooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNoteBooks)));
        System.out.println("grade level to noteBooks: ");
        System.out.println(gradeLevelToBooks);

        // 3 args:
        // collect(groupingBy(classifier, supplier, downstream))
        LinkedHashMap<String, Set<Student>> studentsWithSameNames = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println("students with same names: ");
        System.out.println(studentsWithSameNames);

    }
}
