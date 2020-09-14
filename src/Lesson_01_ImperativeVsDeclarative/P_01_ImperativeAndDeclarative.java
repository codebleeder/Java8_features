package Lesson_01_ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class P_01_ImperativeAndDeclarative {
    public static void main(String[] args){
        // sum of 1 to 100:
        // imperative:
        int sum1 = 0;
        for(int i=0; i<=100; ++i){
            sum1 += i;
        }

        //declarative:
        int sum2 = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("imperative sum: " + sum1);
        System.out.println("declarative sum: " + sum2);
    }
}
