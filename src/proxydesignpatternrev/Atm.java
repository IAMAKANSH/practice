package proxydesignpatternrev;

import java.util.ArrayList;
import java.util.List;

public class Atm implements Bank{

    private Bank bank=new BankImpl();
    List<String> blockedClients=new ArrayList<>(){{
        add("xyx");
        add("zzz");
        add("java");
        add("bob");
    }};

    @Override
    public String withdraw(String clientName) {
       if (!blockedClients.contains(clientName))
           return bank.withdraw(clientName);
       else
           return "No Access";
    }

    @Override
    public String deposit(String clientName) {
        if (!blockedClients.contains(clientName))
            return bank.deposit(clientName);
        else
            return "No Access";
    }
}
