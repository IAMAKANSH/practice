package leetcode.praticeleetcode;

public class Bank {
    //this is fields bank
    private String accountNumber;
    private String accountName;
    private Double amount;

    public Bank(String accountNumber,String accountName,Double amount)
    {
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.amount=amount;
    }

    public void deposit(Double amount)
    {
        this.amount +=amount;
    }

    public  void withdraw(Double amount)
    {
        this.amount -=amount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
