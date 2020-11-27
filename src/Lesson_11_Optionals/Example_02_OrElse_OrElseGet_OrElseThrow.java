package Lesson_11_Optionals;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class Example_02_OrElse_OrElseGet_OrElseThrow {
    public static void main(String[] args) {
        // orElse
        Optional<Student> res1 = Optional.ofNullable(StudentDataBase.studentSupplier
                .get());
        String name = res1.map(Student::getName).orElse("default");
        System.out.println(name);

        Optional<Student> res2 = Optional.ofNullable(null);
        String name2 = res2.map(Student::getName).orElse("null");
        System.out.println(name2);

        // orElseGet
        String name3 = res2.map(Student::getName).orElseGet(()->"default");
        System.out.println(name3);

        // orElseThrow
        String name4 = res2.map(Student::getName)
                .orElseThrow(()->  new RuntimeException("no data available"));

    }
}
