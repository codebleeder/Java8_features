package Lesson_06_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Example_08_LimitSkip {
    public static void main(String[] args) {
        // limit:
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6));
        List<Integer> firstTwoVals = list.stream().limit(2).collect(toList());
        System.out.println(firstTwoVals);

        // skip first 5 values
        List<Integer> lastTwoVals = list.stream().skip(5).collect(toList());
        System.out.println(lastTwoVals);

    }
}
