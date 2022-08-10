package factorydesignpatternrev;

public class ChickenHamBurger extends HamBurger{
    @Override
    void cook() {
        System.out.println("Cooking hamburger with some chicken tikka");
    }
}
