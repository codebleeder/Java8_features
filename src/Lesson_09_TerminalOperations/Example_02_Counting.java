package Lesson_09_TerminalOperations;

import Data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class Example_02_Counting {
    public static void main(String[] args) {
        long count = StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGpa()>=3.9)
                .collect(counting());
        System.out.println(count);

        long count2 = StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGpa()>=3.9)
                .count();
        System.out.println(count2);
    }
}
