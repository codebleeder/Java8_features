package Lesson_02_lambdas;

public class Example_01_Runnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        };
        new Thread(runnable).start();

        // using lambda:
        Runnable runnableLambda = () -> {
            System.out.println("inside runnable lambda");
        };
        new Thread(runnableLambda).run();

        // for single statements, no need of curly braces:
        Runnable runnableLambda2 = () -> System.out.println("inside runnable lambda 2");
        new Thread(runnableLambda2).run();

        // all in single line:
        new Thread(() -> System.out.println("inside runnable lambda 3")).run();
    }
}
