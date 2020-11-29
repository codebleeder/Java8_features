package Lesson_12_Default_and_Static_Methods_in_Interfaces;

import Data.Student;

import java.util.List;

public class Multiplier implements IMultiplier {
    @Override
    public int multiply(List<Integer> list) {
        return list.stream()
                .reduce(1, (a, b)-> a * b);
    }

    @Override
    public int size(List<Integer> list){
        System.out.println("inside Multiplier");
        return list.size();
    }
}
