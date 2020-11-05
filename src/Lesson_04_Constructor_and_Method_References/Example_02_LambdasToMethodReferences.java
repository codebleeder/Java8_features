package Lesson_04_Constructor_and_Method_References;

import Data.Student;
import Data.StudentDataBase;

import java.util.function.Predicate;

public class Example_02_LambdasToMethodReferences {
    public static boolean greaterThanGrade3(Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        Predicate<Student> p = Example_02_LambdasToMethodReferences::greaterThanGrade3;
        System.out.println(p.test(StudentDataBase.getOptionalStudent().get()));
    }
}
