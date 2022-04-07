package day31CustomClassConstuctor;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Joshua Osin",123456789,0);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();

        account1.deposit(900);

        account1.checkBalance();

        System.out.println("--------------------------------------");


        BankAccount account2 = new BankAccount();

        account2.setInfo("Iroda", 2123456, 0);

        account2.deposit(10000);

        System.out.println(account2);

    }
}
