package proxydesignpattern.bankexample;

public class SBIBank implements Bank{


    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println("Withdrawing money from the bank");
    }
}
