package Lesson_06_Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Example_04_DistinctCountSorted {
    public static void main(String[] args) {
        List<String> activities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());

        System.out.println(activities);

        long studCount = StudentDataBase.getAllStudents()
                .stream()
                .count();

        System.out.println(studCount);

        // sort students by name:
        Comparator<Student> nameComparator = (s1, s2)->s1.getName().compareTo(s2.getName());

        List<Student> sortedStudents = StudentDataBase.getAllStudents()
                .stream()
                .sorted(nameComparator)
                .collect(toList());
        System.out.println("sorted students");
        System.out.println(sortedStudents);
        System.out.println("unsorted students: ");
        System.out.println(StudentDataBase.getAllStudents());

        // another way:
        List<Student> sortedStudents2 = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
        System.out.println("sorted students");
        System.out.println(sortedStudents2);

        List<Integer> sortedActivitiesCount = StudentDataBase.getAllStudents()
                .stream()
                .map(s->s.getActivities().size())
                .sorted()
                .collect(toList());
        System.out.println("sorted activity counts: " + sortedActivitiesCount);

        // reverse:
        List<String> sortedNames2 = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .map(Student::getName)
                .collect(toList());
        System.out.println("reverse sorted names: " + sortedNames2);

        // activities reverse sorted:
        List<String> reverseSortedActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(s->s.getActivities())
                .flatMap(a->a.stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        System.out.println("reverse sorted activities: " + reverseSortedActivities);
    }
}
