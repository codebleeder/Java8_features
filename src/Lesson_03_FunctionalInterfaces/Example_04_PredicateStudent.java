package Lesson_03_FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class Example_04_PredicateStudent {
    public static void main(String[] args) {
        Predicate<Student> p1 = student -> student.getGradeLevel()>3;
        Predicate<Student> p2 = student -> student.getGpa()>3;
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(s->{
            if(p1.test(s)){
                System.out.println(s);
            }
        });
        System.out.println("chain using and: ");
        students.forEach(s->{
            if(p1.and(p2).test(s)){
                System.out.println(s);
            }
        });
        // negate
        System.out.println("negate: ");
        students.forEach(s->{
            if(p1.and(p2).negate().test(s)){
                System.out.println(s);
            }
        });
    }
}
