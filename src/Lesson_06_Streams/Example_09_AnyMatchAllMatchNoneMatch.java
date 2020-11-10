package Lesson_06_Streams;

import Data.StudentDataBase;

public class Example_09_AnyMatchAllMatchNoneMatch {
    public static void main(String[] args) {
        // anyMatch():
        boolean anyRes = StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(s->s.getGpa()>=3.9);
        System.out.println("if any student has GPA>=3.9: " + anyRes);

        // allMatch():
        boolean allMatchRes = StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa()>=3.5);
        System.out.println("if any student has GPA>=3.5: " + allMatchRes);

        // noneMatch():
        boolean noneMatchRes = StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa()<3.5);
        System.out.println("if no student have GPA<3.5: " + noneMatchRes);
    }
}
