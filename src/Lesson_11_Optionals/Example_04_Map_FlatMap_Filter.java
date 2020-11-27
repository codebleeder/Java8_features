package Lesson_11_Optionals;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class Example_04_Map_FlatMap_Filter {
    public static void main(String[] args) {
        // filter
        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();
        studentOptional.filter(student -> student.getGpa()>=3.9)
                .ifPresent(student -> System.out.println(student));

        // map
        if(studentOptional.isPresent()){
            Optional<String> str = studentOptional
                    .filter(s->s.getGpa()>=3.9)
                    .map(s->s.getName());
            System.out.println(str.get());
        }

        // flatMap - used to get Optional inside Optional
        Optional<String> bikeName = studentOptional
                .filter(s->s.getGpa()>=3.9)
                .flatMap(s->s.getBike())
                .map(bike -> bike.getName());
        System.out.println(bikeName.get());
    }
}
