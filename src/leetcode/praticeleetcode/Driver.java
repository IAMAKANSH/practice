package leetcode.praticeleetcode;

public class Driver {

    public static void main(String[] args) {

        Bank aishwarya=new Bank("SCINP12345","Aishwarya",500000.00);
        System.out.println("Bank Balance before deposit");
        System.out.println(aishwarya);
        System.out.println("Bank Balance after deposit");
        aishwarya.deposit(25000.00);
        System.out.println(aishwarya);
        aishwarya.withdraw(400000.00);
        System.out.println(aishwarya);
        System.out.println("Someone else try to access aishwarya account");

        System.out.println(aishwarya);

    }
}
