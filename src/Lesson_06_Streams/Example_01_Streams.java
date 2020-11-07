package Lesson_06_Streams;

import Data.Student;
import Data.StudentDataBase;
import Lesson_03_FunctionalInterfaces.Example_04_PredicateStudent;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_01_Streams {
    public static void main(String[] args) {
        Map<String, List<String>> studMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));
        // OR
        Map<String, List<String>> studMap2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(
                        s->s.getName(),
                        s->s.getActivities()
                ));
        System.out.println(studMap);

        // Filter:
        Map<String, List<String>> grade3StudMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>=3)
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));
        System.out.println(grade3StudMap);

        // filter with GPA predicate:
        Map<String, List<String>> gradeGPAFilteredStudMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>=3)
                .filter(Example_04_PredicateStudent.p2)
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));
        System.out.println(gradeGPAFilteredStudMap);

        // debug using peek()
        Map<String, List<String>> gradeGPAFilteredStudMap2 = StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>=3)
                .peek(s-> System.out.println(s))
                .filter(Example_04_PredicateStudent.p2)
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getActivities
                ));

    }
}
