package Lesson_08_NumericStreams;

import java.util.stream.IntStream;

public class Example_01_Introduction {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();
        System.out.println(sum);

        // range - doesn't include 5 in the stream:
        IntStream.range(1,5).forEach(System.out::println);

        // rangeClosed - includes 5 in the stream:
        IntStream.rangeClosed(1,5).forEach(System.out::println);

        // count:
        long count = IntStream.rangeClosed(1,5).count();
        System.out.println("count = " + count);
    }
}
