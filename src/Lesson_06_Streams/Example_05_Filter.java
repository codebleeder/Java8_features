package Lesson_06_Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Example_05_Filter {
    public static void main(String[] args) {
        // get a list of female students:
        List<Student> femaleStuds = StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equals("female"))
                .collect(Collectors.toList());
        System.out.println(femaleStuds);
    }
}
