package factorydesignpatternrev;

public class CheeseHamBurger extends HamBurger{
    @Override
    void cook() {
        System.out.println("Cooking burger....Adding slices of cheese");
    }
}
