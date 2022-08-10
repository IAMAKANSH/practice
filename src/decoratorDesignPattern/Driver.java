package decoratorDesignPattern;

public class Driver {

    public static void main(String[] args) {


        IceCream basic=new BasicIceCream();
        System.out.println(basic.cost());

        //Adding Vanilla
        IceCream butterScotchIceCream=new ButterScotchIceCream(basic);
        System.out.println(butterScotchIceCream.cost());
    }
}
