package Lesson_04_Constructor_and_Method_References;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example_01_MethodReference {
    public static void main(String[] args) {
        Function<String, String> upper = name -> name.toUpperCase();
        // above Function to method reference:
        Function<String, String> upperUsingMethodRef = String::toUpperCase;
        System.out.println(upperUsingMethodRef.apply("motivation"));

        Consumer<Student> printActivities = Student::printListOfActivities;
        StudentDataBase.getAllStudents().forEach(printActivities);
    }
}
