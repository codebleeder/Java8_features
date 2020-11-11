package Lesson_08_NumericStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example_03_Boxing_UnBoxing_MapToInt {
    public static void main(String[] args) {
        //Boxing:
        List<Integer> list = IntStream.rangeClosed(1,5) // produces 1 to 5 in int
                .boxed() // converts int to Integer
                .collect(Collectors.toList());

        //unboxing using mapToInt - convert Integer to int:
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,55,67));
        int[] arr = list1.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
