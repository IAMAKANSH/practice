package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    String name;
    Double amount;
    final Lock lock=new ReentrantLock();


    public Bank(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Boolean withdraw(Double amount) throws InterruptedException {
       if(lock.tryLock())
       {
           Thread.sleep(100);
           this.amount -=amount;
           this.lock.unlock();
           return true;
       }
       return false;
    }

    public Boolean deposit(Double amount) throws InterruptedException {
        if (lock.tryLock())
        {
            Thread.sleep(2000);
            this.amount +=amount;
            this.lock.unlock();
            return true;
        }
        return false;
    }

    public Boolean deposit(Bank to, Double amount) throws InterruptedException {
        if (withdraw(amount))
        {
            System.out.println("Withdrawing amount : "+amount+ " from account "+ name);
            if (to.deposit(amount))
            {
                System.out.println("Depositing amount : "+amount + " to account "+to.name);
                return true;
            }
            else {
                System.out.println("Failed to acquire both locks : refunding "+amount+ " to "+ name);
                while (!deposit(amount))
                {
                    continue;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Bank bob=new Bank("BOB",2000000.00);
        Bank charle=new Bank("Charle", 300000.00);

        System.out.println("Starting balance of student account is "+bob.amount);
        System.out.println("Starting balance of university account is "+charle.amount);


        Thread t=new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+ "says: Executing Transfer");
            try{
                while (!bob.deposit(charle,40000.00))
                {
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        ExecutorService service= Executors.newFixedThreadPool(10);
        for (int i=0;i<20;i++)
        {
            service.submit(t);
        }
        service.shutdown();

try{
    while (!service.awaitTermination(24L, TimeUnit.HOURS))
    {
        System.out.println("Not yet! Still waiting for termination");
    }
} catch (InterruptedException e) {
    e.printStackTrace();
}
        System.out.println("Balance for bob is "+bob.amount);
        System.out.println("Balance for charle is "+charle.amount);
    }
}
