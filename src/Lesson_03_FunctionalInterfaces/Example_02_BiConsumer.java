package Lesson_03_FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class Example_02_BiConsumer {
    public static void main(String[] args){
        BiConsumer<String, String> bc1 = (a, b)-> System.out.println(String.format("a: %s, b: %s",a,b));
        bc1.accept("str1", "str2");

        BiConsumer<Integer, Integer> bcMultiply = (a, b)->{
            System.out.println("Multiply: " + (a*b));
        };

        BiConsumer<Integer, Integer> bcDivide = (a, b)-> System.out.println("divide: " + (a/b));
        bcMultiply.andThen(bcDivide).accept(10,5);

        printNameAndActivities();
    }
    public static void printNameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> bcNameActivities = (name, activities)-> System.out.println(name + " " + activities);
        students.forEach((s)->bcNameActivities.accept(s.getName(), s.getActivities()));
    }
}
