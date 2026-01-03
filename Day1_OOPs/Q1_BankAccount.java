package Practise_Questions.Day1_OOPs;
/*
Q1. BankAccount Design

- balance should NOT be public
- deposits and withdrawals must be controlled using methods
- encapsulation helps enforce banking rules
*/

class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
}

public class Q1_BankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("AC101", "Ankit", 5000);
        acc.deposit(2000);
        acc.withdraw(1000);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
