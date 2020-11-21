package Lesson_10_ParallelStreams;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Example_01_Introduction {
    public static void main(String[] args) {
        // sequential:
        Supplier<Integer> sumSeq = () -> IntStream.rangeClosed(1,1000000)
                .sum();

        // parallel:
        Supplier<Integer> sumParallel = () -> IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();

        // BiFunction takes in a supplier, number of times the supplier needs to execute and
        // returns execution time:
        BiFunction<Supplier<Integer>, Integer, Long> execTime = (supplier, n) -> {
            long startTime = System.currentTimeMillis();
            for(int i=0; i<n; ++i){
                supplier.get();
            }
            long endTime = System.currentTimeMillis();
            return endTime-startTime;
        };

        System.out.println("sequential exec time: " + execTime.apply(sumSeq, 10000));
        System.out.println("parallel exec time: " + execTime.apply(sumParallel, 10000));
        System.out.println("available processors: " + Runtime.getRuntime().availableProcessors());
    }
}
