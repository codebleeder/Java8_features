package Lesson_06_Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Example_03_FlatMap {
    public static void main(String[] args) {
        Set<String> activities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .peek(s-> System.out.println(s))
                .collect(toSet());

        System.out.println(activities);

        Set<String> activities2 = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(a->a.stream())
               // .peek(s-> System.out.println(s))
                .collect(toSet());
        System.out.println(activities2);
    }
}
