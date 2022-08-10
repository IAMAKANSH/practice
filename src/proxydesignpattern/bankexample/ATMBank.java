package proxydesignpattern.bankexample;

import java.util.ArrayList;
import java.util.List;

public class ATMBank implements Bank{

    private SBIBank sbiBank=new SBIBank();
    private static List<String> bannedClient;

    static {
        bannedClient=new ArrayList<>();
        bannedClient.add("bob");
        bannedClient.add("charles");
        bannedClient.add("gorge");
    }
    @Override
    public void withdrawMoney(String clientName) throws Exception {

        if(bannedClient.contains(clientName))
            throw new Exception(clientName+" is banned for the transaction");

        sbiBank.withdrawMoney(clientName);
    }
}
