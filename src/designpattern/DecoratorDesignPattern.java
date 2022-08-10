package designpattern;

public class DecoratorDesignPattern {

    public static void main(String[] args) {
//        Runtime.getRuntime();
//        Desktop.getDesktop();
//        System.getSecurityManager();
        IceCream basicIceCream=new BasicIceCream();
        System.out.println("Basic ice cream cost "+basicIceCream.price());

        IceCream vanilla=new Vanilla(basicIceCream);
        System.out.println(vanilla.price());

        IceCream choclateVanilla=new Chocolate(vanilla);
        System.out.println(choclateVanilla.price());
    }
}
interface IceCream{
    Double price();
}
class IceCreamDecorator implements IceCream{

    private IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream=iceCream;
    }

    @Override
    public Double price() {
        return this.iceCream.price() ;
    }
}
class Vanilla extends IceCreamDecorator{


    public Vanilla(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public Double price() {
        return super.price()+30;
    }
}
class Chocolate extends IceCreamDecorator{

    public Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public Double price() {
        return super.price()+40;
    }
}
class Alphanso extends IceCreamDecorator{

    public Alphanso(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public Double price() {
        return super.price()+35;
    }
}
class BasicIceCream implements IceCream{

    public BasicIceCream() {
        System.out.println("Creating a basic ice cream!");
    }

    @Override
    public Double price() {
        return 20.00;
    }
}
