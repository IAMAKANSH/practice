package factorydesignpatternrev;

public class Driver {

    public static void main(String[] args) {
        HamBurgerStore hamBurgerStore=new HamBurgerStore();
        hamBurgerStore.orderHamburger("chicken");
        //ResourceBundle.getBundle()
    }
}
