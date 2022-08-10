package factorydesignpatternrev;

public class SimpleFactory {

    public HamBurger createBurger(String type){
        HamBurger hamBurger = null;

        if (type.equals("cheese"))
        {
            hamBurger=new CheeseHamBurger();
        }
        if (type.equals("chicken"))
        {
            hamBurger=new ChickenHamBurger();
        }
        return hamBurger;
    }
}
