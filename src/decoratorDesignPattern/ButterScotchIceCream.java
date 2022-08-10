package decoratorDesignPattern;

public class ButterScotchIceCream extends IceCreamDecorator{
    public ButterScotchIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding vanilla ice cream");
        return super.cost()+8.00;
    }
}
