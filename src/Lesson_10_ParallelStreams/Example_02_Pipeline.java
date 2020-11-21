package Lesson_10_ParallelStreams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;

public class Example_02_Pipeline {
    public static void main(String[] args) {
        Supplier<List<String>> reverseSortedActivitiesSeq = ()-> {
            long startTime = System.currentTimeMillis();
            List<String> res = StudentDataBase.getAllStudents()
                    .stream()
                    .map(s -> s.getActivities())
                    .flatMap(a -> a.stream())
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(toList());
            long endTime = System.currentTimeMillis();
            System.out.println("seq: " + (endTime-startTime));
            return res;
        };

        Supplier<List<String>> reverseSortedActivitiesParallel = ()-> {
            long startTime = System.currentTimeMillis();
            List<String> res = StudentDataBase.getAllStudents()
                    .stream()
                    .parallel()
                    .map(s -> s.getActivities())
                    .flatMap(a -> a.stream())
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(toList());
            long endTime = System.currentTimeMillis();
            System.out.println("parallel: " + (endTime-startTime));
            return res;
        };

        System.out.println("seq: " + reverseSortedActivitiesSeq.get());
        System.out.println("parallel: " + reverseSortedActivitiesParallel.get());
    }
}
