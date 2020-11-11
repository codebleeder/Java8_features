package Lesson_08_NumericStreams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Example_02_AggregateFunctions {
    public static void main(String[] args) {
        //sum:
        System.out.println(IntStream.rangeClosed(1,5).sum());

        //max produces an OptionalInt:
        System.out.println(IntStream.of(12,1,2,33).max().getAsInt());

        //min:
        //produces OptionalLong:
        System.out.println(LongStream.of(22,11,33).min().getAsLong());

        //average produces OptionalDouble:
        System.out.println(IntStream.of(21,23,42,89).average().getAsDouble());

    }
}
