package ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_02_UniqueList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,3,3,4,4,4,5,6,6,7,7,7,8,9));
        // imperative:
        List<Integer> res1 = new ArrayList<>();
        for(int i: list){
            if(!res1.contains(i)){
                res1.add(i);
            }
        }

        // declarative:
        List<Integer> res2 = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("imperative: " + res1);
        System.out.println("declarative: " + res2);
    }



}
