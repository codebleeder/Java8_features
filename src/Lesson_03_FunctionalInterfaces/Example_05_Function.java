package Lesson_03_FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example_05_Function {
    public static void main(String[] args) {
        Function<String, String> upper = name -> name.toUpperCase();
        Function<String, String> concatSomething = name -> name.concat(" something");
        System.out.println("Function.apply():");
        System.out.println(upper.apply("sharad"));

        System.out.println("Function1.andThen(Function2): ");
        System.out.println(upper.andThen(concatSomething).apply("biology"));

        System.out.println("compose: ");
        System.out.println(upper.compose(concatSomething).apply("biology"));

        System.out.println("students example: ");
        Function<List<Student>, Map<String, Integer>> studentFunc = students -> {
          Map<String, Integer> map = new HashMap<>();
          students.forEach(student -> map.put(student.getName(), student.getGradeLevel()));
          return map;
        };
        System.out.println(studentFunc.apply(StudentDataBase.getAllStudents()));

        System.out.println("students example using BiFunction: ");
        BiFunction<List<Student>, Predicate<Student>,Map<String, Integer>> studentFunc2 = (students, studPredicate) -> {
            Map<String, Integer> map = new HashMap<>();
            students.forEach(student -> {
                if(studPredicate.test(student)){
                    map.put(student.getName(), student.getGradeLevel());
                }
            });
            return map;
        };
        System.out.println(studentFunc2.apply(StudentDataBase.getAllStudents(), Example_04_PredicateStudent.p1));
    }
}
