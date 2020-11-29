package Lesson_12_Default_and_Static_Methods_in_Interfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class Example_02_Defaults2 {
    public static void main(String[] args) {
        // sort students by name:
        Comparator<Student> nameComparator = Comparator.comparing(s->s.getName());
        List<Student> students = StudentDataBase.getAllStudents();
        //students.sort(nameComparator);
        //students.forEach(s-> System.out.println(s));

        System.out.println("sort by GPA:");
        Comparator<Student> gpaComparator = Comparator.comparingDouble(s->s.getGpa());
        //students.sort(gpaComparator);
        //students.forEach(s-> System.out.println(s));

        // comparator chaining:
        Comparator<Student> gradeComparator = Comparator.comparingInt(s->s.getGradeLevel());
        //students.sort(gradeComparator.thenComparing(nameComparator));
        //students.forEach(s-> System.out.println(s));

        // sort with nulls - nullsFirst, nullsLast:
        Comparator<Student> nullComparator = Comparator.nullsFirst(nameComparator);
        //students.add(null);
        students.sort(nullComparator);
        students.forEach(System.out::println);
    }
}
