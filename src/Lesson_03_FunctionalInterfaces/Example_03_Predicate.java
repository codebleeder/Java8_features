package Lesson_03_FunctionalInterfaces;

import java.util.function.Predicate;

public class Example_03_Predicate {
    static Predicate<Integer> evenOdd = (n) ->  n%2 == 0;
    static Predicate<Integer> divisibleBy5 = (n) ->  n%5 == 0;
    public static void main(String[] args){
        System.out.println("evenOdd.test(4)= " + evenOdd.test(4));
        System.out.println("evenOdd.test(5)= " + evenOdd.test(5));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    public static void predicateAnd(){
        System.out.println("evenOdd.and(divisibleBy5).test(10)=" + evenOdd.and(divisibleBy5).test(10));
        System.out.println("evenOdd.and(divisibleBy5).test(12)="+evenOdd.and(divisibleBy5).test(12));
    }

    public static void predicateOr(){
        System.out.println("evenOdd.or(divisibleBy5).test(10)="+evenOdd.or(divisibleBy5).test(10));
        System.out.println("evenOdd.or(divisibleBy5).test(12)= "+evenOdd.or(divisibleBy5).test(12));
    }

    public static void predicateNegate(){
        System.out.println("evenOdd.negate().test(10)= " + evenOdd.negate().test(10));
    }
}
