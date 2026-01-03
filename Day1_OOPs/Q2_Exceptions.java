package Practise_Questions.Day1_OOPs;
/*
Q2. Insufficient Balance Scenario

- Use unchecked exception
- Exception handling prevents system failure
- Custom exception improves readability
*/

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {

    private double balance = 3000;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
    }
}

public class Q2_Exceptions {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.withdraw(5000); // runtime exception
    }
}
