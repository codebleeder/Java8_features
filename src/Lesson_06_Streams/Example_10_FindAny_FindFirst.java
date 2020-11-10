package Lesson_06_Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class Example_10_FindAny_FindFirst {
    public static void main(String[] args) {
        // findAny()
        Optional<Student> res1 = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
        if(res1.isPresent()){
            System.out.println(res1.get());
        }

        // findFirst():
        Optional<Student> res2 = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.7)
                .findFirst();
        if(res2.isPresent()){
            System.out.println(res2.get());
        }
    }
}
