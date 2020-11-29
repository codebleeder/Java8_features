package Lesson_12_Default_and_Static_Methods_in_Interfaces;

public class Example_04_MultipleInheritance {
    public static interface Interface1 {
        default void methodA(){
            System.out.println("Interface1.methodA()");
        }
    }

    public static interface Interface2 extends Interface1{
        default void methodB(){
            System.out.println("Interface2.methodB()");
        }

        default void methodA(){
            System.out.println("Override: Interface2.methodA()");
        }
    }

    public static interface Interface3 extends Interface2 {
        default void methodC(){
            System.out.println("Interface3.methodC()");
        }
    }

    public static interface Interface4 {
        default void methodA(){
            System.out.println("Interface4.methodA()");
        }
    }
    public static class Client123 implements Interface1, Interface2, Interface3{

    }

    public static class Client14 implements Interface1, Interface4 {
        // since Interface1 and Interface4 have same method signature, you
        // must override them with another implementation:
        public void methodA(){
            System.out.println("Client14.methodA()");
        }
    }

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA(); // resolves to child implementation
        client123.methodB();
        client123.methodC();


    }
}
