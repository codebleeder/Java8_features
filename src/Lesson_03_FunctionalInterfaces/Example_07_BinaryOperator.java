package Lesson_03_FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Example_07_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a+b;
        System.out.println("add 2+3 = " + add.apply(2,3));

        Comparator<Integer> integerComparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(integerComparator);
        System.out.println("maxBy(3,2) = " + maxBy.apply(3, 2));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(integerComparator);
        System.out.println("minBy(3,2) = " + minBy.apply(3, 2));
    }
}
