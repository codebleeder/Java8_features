package Lesson_12_Default_and_Static_Methods_in_Interfaces;

import Data.Student;

import java.util.List;

public interface IMultiplier {
    int multiply(List<Integer> list);

    // java 8 features:
    // default can be overridden
    default int size(List<Integer> list){
        System.out.println("inside IMultiplier");
        return list.size();
    }

    // static method cannot be overridden
    static boolean isEmpty(List<Integer> list){
        return list.isEmpty();
    }
}
