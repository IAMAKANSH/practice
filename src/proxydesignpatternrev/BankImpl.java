package proxydesignpatternrev;

public class BankImpl implements Bank{

    public String deposit(String clientName)
    {
        return "Amount is deposited for "+ clientName;
    }

    public String withdraw(String clientName)
    {
       return "Amount is withdraw for "+clientName;
    }

}
