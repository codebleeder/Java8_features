package Lesson_12_Default_and_Static_Methods_in_Interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example_01_Defaults {
    public static void main(String[] args) {
        // sort list names in alphabetical order
        List<String> names = Arrays.asList("Adam", "Jenny", "Wei", "Dan");

        // before Java 8
        Collections.sort(names);

        // new in Java 8 - sort is a default implementation in List interface
        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
