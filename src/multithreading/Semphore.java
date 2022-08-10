package multithreading;

public class Semphore {

    private int signal=0;

    public synchronized void take()
    {
        signal++;
        this.notify();
    }

    public synchronized void release() throws InterruptedException {
        while (this.signal==0)
        {
            this.wait();
        }
        this.signal--;
    }
    /**
     *
     * Semaphore is a class in java.util package
     * Semaphore is generally used for restrict the resource from the no of permits using the counter
     * if the counter is greater than zero permit is allowed and if zero it is restricted.
     *
     */
    public static void main(String[] args) {

        Semphore semphore
                =new Semphore();


        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+ " is calling and value of signal is "+semphore.signal);
            semphore.take();
        },"take").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+ " is calling and value of signal is "+semphore.signal);
            try {
                semphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"release").start();
    }
}
