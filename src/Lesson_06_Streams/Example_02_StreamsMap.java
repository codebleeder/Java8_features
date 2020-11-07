package Lesson_06_Streams;

import Data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example_02_StreamsMap {
    public static void main(String[] args) {
        List<String> studNames = StudentDataBase.getAllStudents()
                .stream()
                .map(s->s.getName())// Student::getName can also be used
                .map(name->name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(studNames);

        // set:
        Set<String> studNamesSet = StudentDataBase.getAllStudents()
                .stream()
                .map(s->s.getName())// Student::getName can also be used
                .map(name->name.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(studNamesSet);
    }
}
