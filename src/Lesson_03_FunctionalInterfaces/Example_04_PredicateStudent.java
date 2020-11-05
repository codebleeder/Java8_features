package Lesson_03_FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example_04_PredicateStudent {
    static Predicate<Student> p1 = student -> student.getGradeLevel()>3;
    static Predicate<Student> p2 = student -> student.getGpa()>3;
    public static void main(String[] args) {

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

        // BiPredicate:
        System.out.println("BiPredicate: ");
        BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.9;
        students.forEach(s->{
            if(biPredicate.test(s.getGradeLevel(), s.getGpa())){
                System.out.println(s);
            }
        });
    }
}
