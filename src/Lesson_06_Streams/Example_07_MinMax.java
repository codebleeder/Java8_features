package Lesson_06_Streams;

import Data.StudentDataBase;

public class Example_07_MinMax {
    public static void main(String[] args) {
        var highestGPA = StudentDataBase.getAllStudents()
                .stream()
                .mapToDouble(s->s.getGpa())
                .max();
        System.out.println(highestGPA.isPresent() ? highestGPA.getAsDouble() : "null");

        var lowestGPA = StudentDataBase.getAllStudents()
                .stream()
                .mapToDouble(s->s.getGpa())
                .min();
        System.out.println(lowestGPA.isPresent() ? lowestGPA.getAsDouble() : "null");
    }
}
