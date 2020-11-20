package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class Example_03_Mapping {
    public static void main(String[] args) {
        List<String> studNames = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));
        System.out.println(studNames);

        List<String> studNames2 = StudentDataBase.getAllStudents()
                .stream().map(Student::getName).collect(toList());
        System.out.println(studNames2);

        Set<String> studNamesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));
        System.out.println(studNamesSet);
    }
}
