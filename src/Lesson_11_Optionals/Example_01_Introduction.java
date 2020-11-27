package Lesson_11_Optionals;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class Example_01_Introduction {
    public static void main(String[] args) {
        String name = null;
        if(name != null){
            System.out.println(name); // will throw null pointer exception if not checked for null
        }
        else {
            System.out.println("null");
        }


        Optional<Student> name2 = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name3 = Optional.empty();
        name3 = Optional.of("sharad");
        name3.ifPresent(System.out::println);

        // ofNullable - null is acceptable
        Optional<String> res1 = Optional.ofNullable(null);
        System.out.println(res1);

        // of - doesn't accept null
        Optional<String> res2 = Optional.of("hello 2");
        System.out.println(res2);

        // empty - no need to instantiate with any value
        Optional<String> res3 = Optional.empty();
        System.out.println(res3);
    }
}
