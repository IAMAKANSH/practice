package copydesignpatterndecorator;

import java.io.IOException;

public class DecoTest {

    public static void main(String[] args) throws IOException {

//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        Integer ans= Integer.parseInt(reader.readLine());
//        System.out.println(ans);
//        List<Integer> lis= new ArrayList<>();
//        lis.add(10);
//        List<Integer> ans1= Collections.unmodifiableList(lis);
//        System.out.println(ans1);
        BaseIcecream baseIcecream=new BaseIcecream();
        System.out.println(baseIcecream.cost());
        IceCream vanilla1=new Vanilla1(baseIcecream);
        System.out.println(vanilla1.cost());
        IceCream choclateVanillaIceCream=new Chocolate1(vanilla1);
        System.out.println(choclateVanillaIceCream.cost());
    }
}
interface IceCream{
    double cost();
}
class IceCreamDecorator implements IceCream{

    private IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream=iceCream;
    }

    @Override
    public double cost() {
        return iceCream.cost();
    }
}
class BaseIcecream implements IceCream{

    public BaseIcecream() {
        System.out.println("Creating the basic ice cream");
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
class Chocolate1 extends IceCreamDecorator{

    public Chocolate1(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost()+20.0;
    }
}
class Vanilla1 extends IceCreamDecorator{

    public Vanilla1(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return super.cost()+12.00;
    }
}

