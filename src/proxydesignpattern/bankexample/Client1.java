package proxydesignpattern.bankexample;

public class Client1 {

    public static void main(String[] args) {
        Bank sbiBank=new ATMBank();
        try {
            sbiBank.withdrawMoney("bob");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
