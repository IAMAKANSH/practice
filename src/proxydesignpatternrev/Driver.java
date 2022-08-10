package proxydesignpatternrev;

public class Driver {

    public static void main(String[] args) {

        Bank sbi=new Atm();
        System.out.println(sbi.withdraw("java"));

        System.out.println(sbi.withdraw("jai"));
    }
}
