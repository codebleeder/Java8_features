package Lesson_09_TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class Example_08_PartitioningBy {
    public static void main(String[] args) {
        Map<Boolean, List<Student>> studentsPartitionedByGpa = StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        partitioningBy(s->s.getGpa()>=3.9)
                );
        System.out.println(studentsPartitionedByGpa);

        // with downstream argument - downstream is just another Collector function:
        Map<Boolean, Set<Student>> studentsPartitionedByGpa2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        partitioningBy(s->s.getGpa()>=3.9,
                                toSet()
                        )

                );
        System.out.println(studentsPartitionedByGpa2);
    }
}
