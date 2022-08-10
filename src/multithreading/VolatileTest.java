package multithreading;

public class VolatileTest {

    public volatile static Boolean flag=false;

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Runnable 1 is running");
            for (int i=0;i<=9999;i++)
            {
                System.out.println("Runnable 1 is running with index "+i);
            }
            System.out.println("Runnable 1 altered the flag to true");
            flag=true;
        }).start();

        new Thread(() -> {
            System.out.println("Runnable 2 is running");
            int i=0;
            //flag=false
            while (!flag)
            {
                i++;
            }
            System.out.println("Runnable 2 is running with index "+i);
        }).start();
    }
}
