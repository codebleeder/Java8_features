package Lesson_11_Optionals;

import java.util.Optional;

public class Example_03_IsPresent_IfPresent {
    public static void main(String[] args) {
        // isPresent
        Optional<String> a = Optional.of("a");
        Optional<String> b = Optional.empty();
        System.out.println(a.isPresent());
        System.out.println(b.isPresent());

        // ifPresent
        a.ifPresent(s-> System.out.println(s));
    }
}
