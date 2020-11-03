package Lesson_02_lambdas;

import java.util.Comparator;

public class Example_02_ComparatorLambda {
    public static void main(String[] args) {
        // old way:
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        // using lambda:
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
        System.out.println("old: " + comparator.compare(3,2));
        System.out.println("lambda: " + comparatorLambda.compare(3,2));
        System.out.println("lambda: " + comparatorLambda2.compare(3,2));
    }
}
