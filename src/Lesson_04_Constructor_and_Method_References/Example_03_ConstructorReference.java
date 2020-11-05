package Lesson_04_Constructor_and_Method_References;

import Data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example_03_ConstructorReference {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new; // Student MUST have an empty constructor
        System.out.println(studentSupplier.get());

        // Student MUST have a constructor that takes one String argument:
        Function<String, Student> studentFunction = Student::new;
        System.out.println(studentFunction.apply("Ram"));
    }
}
