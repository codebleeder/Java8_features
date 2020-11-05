package Lesson_03_FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class Example_06_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> nameToUpperCase = s -> s.toUpperCase();
        System.out.println(nameToUpperCase.apply("ram"));
    }
}
