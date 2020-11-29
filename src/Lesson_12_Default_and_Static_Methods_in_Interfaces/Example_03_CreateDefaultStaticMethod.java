package Lesson_12_Default_and_Static_Methods_in_Interfaces;

import java.util.Arrays;
import java.util.List;

public class Example_03_CreateDefaultStaticMethod {
    public static void main(String[] args) {
        Multiplier mult = new Multiplier();
        List<Integer> list = Arrays.asList(1,3,5);
        System.out.println(mult.multiply(list));

        // using default method:
        System.out.println(mult.size(list)); // overriden by Multiplier

        // using static method:
        System.out.println(IMultiplier.isEmpty(list));


    }
}
