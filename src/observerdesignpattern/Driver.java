package observerdesignpattern;

public class Driver {

    public static void main(String[] args) {

        EmailTopic flipkart=new EmailTopic();


        //create observers
        Observer akansh=new EmailTopicSubscriber("Akansh");
        Observer rahul=new EmailTopicSubscriber("Rahul");
        Observer jerry=new EmailTopicSubscriber("Jerry");

        flipkart.subscribe(akansh);
        flipkart.subscribe(rahul);
        flipkart.subscribe(jerry);

        //Attaching subject to the observer
        akansh.setSubject(flipkart);
        rahul.setSubject(flipkart);
        jerry.setSubject(flipkart);

        akansh.update();

        flipkart.postMessage("Big Billions Sale will start from 15July.. Save items to the cart ");
    }
}
