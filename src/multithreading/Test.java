package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.start();

        Test2 test2=new Test2();
        test2.run();;

        new Thread(() -> {
            System.out.println("Akansh interview");
        },"threadInterview").start();

        //We can even perform operation
        //Using Callable and Runnable

        Runnable runnable=() -> {
            System.out.println("Hey Calling");
        };

        ExecutorService executorService= Executors.newFixedThreadPool(1);
        executorService.submit(runnable);


    }
}

class Test2 implements Runnable{

    @Override
    public void run() {
        System.out.println("test2 thread is running");
    }
}
