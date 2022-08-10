package observerdesignpattern.example2;

public class Driver {

    public static void main(String[] args) {

        ProviderImpl airtel=new ProviderImpl();

        Listener akansh= new ListenerImpl("Akansh");
        Listener jerry=new ListenerImpl("Jerry");
        Listener bob=new ListenerImpl("Bob");

        airtel.subscriber(akansh);
        airtel.subscriber(jerry);
        airtel.subscriber(bob);


        akansh.setProvider(airtel);
        jerry.setProvider(airtel);
        bob.setProvider(airtel);
        System.out.println("Akansh want to check the offer");
        //akansh want to check whether any offer is available or not
        akansh.update();

        System.out.println("Airtel provider releases new offer");
        //provider releases new offer
        airtel.postMessage("Hey new offer recharge with 399 or above and get 100 rupee cashback");

        System.out.println("Akansh unsubscribed");
        airtel.unsubscribe(akansh);

        airtel.postMessage("100% cashback");
    }
}
