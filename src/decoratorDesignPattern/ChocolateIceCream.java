package decoratorDesignPattern;

public class ChocolateIceCream extends IceCreamDecorator{

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding chocolate ice cream");
        return super.cost()+10.00;
    }
}
