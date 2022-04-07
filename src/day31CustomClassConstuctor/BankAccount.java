package day31CustomClassConstuctor;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){

        System.out.println(balance);
    }

    public void deposit(double amount){

        if (amount <= 0) {
            System.err.println("Deposit cannot be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            System.err.println("Withdraw cannot be zero or negative");
            return;
        } else if (amount > balance) {
            System.err.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }


}
