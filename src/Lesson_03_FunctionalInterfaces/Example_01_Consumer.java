package Lesson_03_FunctionalInterfaces;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class Example_01_Consumer {
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("sharad");
        //printName();
        //printNameAndActivities();
        printStudentsAboveGrade3();
    }
    public static Consumer<Student> studentConsumer = (s)-> System.out.println(s);
    public static Consumer<Student> studentNameConsumer = (s)-> System.out.println(s.getName());
    public static Consumer<Student> studentActivitiesConsumer = (s)-> System.out.println(s.getActivities());
    public static void printName(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
    }
    public static void printNameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();
        // consumer chaining:
        students.forEach(studentNameConsumer.andThen(studentActivitiesConsumer));
    }
    public static void printStudentsAboveGrade3(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((s)->{
            if(s.getGradeLevel()>=3){
                studentNameConsumer.andThen(studentActivitiesConsumer).accept(s);
            }
        });
    }
}
