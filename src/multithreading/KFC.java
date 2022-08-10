package multithreading;

public class KFC {
    String lastOrderCustomerName;
    long noOfOrders;

    public KFC() {

        this.lastOrderCustomerName=null;
        this.noOfOrders=0;
    }

    public void placeOrder(String customer)
    {
        processingOrder();
        System.out.println("Order is placed for "+customer);
        synchronized (this) {
            this.lastOrderCustomerName = customer;
            noOfOrders++;
        }
    }

    private void processingOrder() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        KFC kfc=new KFC();

        Thread t1=new Thread(() -> {
            kfc.placeOrder("Akansh");
        });
        Thread t2=new Thread(() -> {
            kfc.placeOrder("Bob");
        });
        Thread t3=new Thread(() -> {
            kfc.placeOrder("Gill");
        });
        Thread t4=new Thread(() -> {
            kfc.placeOrder("Mahi");
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Last Customer who palced the order is "+kfc.lastOrderCustomerName);
        System.out.println("Total No Of Orders are "+kfc.noOfOrders);
    }
}
