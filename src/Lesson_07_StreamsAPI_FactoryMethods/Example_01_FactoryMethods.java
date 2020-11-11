package Lesson_07_StreamsAPI_FactoryMethods;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Example_01_FactoryMethods {
    public static void main(String[] args) {
        // of()
        Stream<String> stringStream = Stream.of("adam", "tom", "jane");

        // iterate()
        List<Integer> doubles = Stream.iterate(1, x->x*2)
                .limit(10)
                .collect(toList());
        System.out.println(doubles);

        List<int[]> fibonacci = Stream.iterate(new int[]{0,1}, x-> new int[]{x[1], x[0]+x[1]})
                .limit(10)
                .collect(toList());

        for(int i=0; i<fibonacci.size(); ++i){
            System.out.println(fibonacci.get(i)[0] + ", " + fibonacci.get(i)[1]);
        }

        Stream.generate(()->{
            Random r = new Random();
            return r.nextInt(10);
        })
                .limit(10)
                .forEach(System.out::println);
    }
}
