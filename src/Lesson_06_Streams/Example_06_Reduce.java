package Lesson_06_Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example_06_Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int product = list
                .stream()
                .reduce(1, (a,b)->a*b);
        System.out.println(product);

        // reduce without identity argument will produce Optional<>:
        Optional<Student> highestGPA = StudentDataBase.getAllStudents()
                .stream()
                .reduce((a,b)->{
                    return a.getGpa()>b.getGpa() ? a : b;
                });
        System.out.println(highestGPA);

        var highestGPA2 = StudentDataBase.getAllStudents()
                .stream()
                .mapToDouble(s->s.getGpa())
                .max();
        System.out.println(highestGPA2.isPresent() ? highestGPA2.getAsDouble() : "null");
    }
}
