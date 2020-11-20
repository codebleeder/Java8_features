package Lesson_08_NumericStreams;

import Data.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example_04_mapToObj_mapToLong_mapToDouble {
    public static void main(String[] args) {
        // mapToObj:
        List<Student> students = IntStream.rangeClosed(1,4)
                .mapToObj(i-> {
                    Student newStudent = new Student();
                    newStudent.setGradeLevel(i);
                    return newStudent;
                })
                .collect(Collectors.toList());
        System.out.println(students);

        // mapToLong:
        long sum = IntStream.rangeClosed(1,4)
                .mapToLong(i->i)
                .sum();
        System.out.println(sum);

        // mapToDouble:
        Double sum2 = IntStream.rangeClosed(1,4)
                .mapToDouble(i->i)
                .sum();
        System.out.println(sum2);
    }

}
