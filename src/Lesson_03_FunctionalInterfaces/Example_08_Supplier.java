package Lesson_03_FunctionalInterfaces;

import Data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class Example_08_Supplier {
    public static void main(String[] args) {
        Supplier<Student> getStudentInstance = () -> new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        Student student = getStudentInstance.get();
        System.out.println(student);
    }
}
