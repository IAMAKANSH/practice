package factorydesignpatternrev;

public class HamBurgerStore {

    HamBurger orderHamburger(String type){
        SimpleFactory factory=new SimpleFactory();
        HamBurger hamBurger = factory.createBurger(type);
        hamBurger.prepare();
        hamBurger.cook();
        hamBurger.pack();
        return hamBurger;
    }
}
