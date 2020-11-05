package Lesson_05_LambdasAndLocalVariables;

import java.util.function.Function;

public class Example_01_VariableRulesForLambdas {
    public static void main(String[] args) {
        int i = 0;
        int value = 10;
        Function<Integer, Integer> functionSquare = (n) -> { // cannot use or modify i and value variables
            // value++; // value is already defined and cannot be modified
            int x = value + 2; // you can use 'value' as a final variable - Effective final
            System.out.println("x = " + x);
            return n*n;

        };
        System.out.println(functionSquare.apply(2));
    }
}
