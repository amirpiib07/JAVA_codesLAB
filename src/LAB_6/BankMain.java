package LAB_6;
import java.util.Scanner;

class Bank {
    // Deposit -- returns new balance
    public double deposit(double amount, double balance) {
        double newBalance = balance + amount;
        System.out.printf("Deposited: $%.2f | New Balance: $%.2f%n",
                amount, newBalance);
        return newBalance;
    }

    // Withdraw -- returns new balance or 0 if insufficient
    public double withdraw(double amount, double balance) {
        if (balance >= amount) {
            double newBalance = balance - amount;
            System.out.printf("Withdrawn: $%.2f | New Balance: $%.2f%n",
                    amount, newBalance);
            return newBalance;
        } else {
            System.out.println("Insufficient funds! Withdrawal of $"
                    + amount + " failed.");
            return 0;
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank    = new Bank();
        double balance = 1000.00;

        System.out.println("Starting Balance: $" + balance);

        balance = bank.deposit(500.00, balance);
        balance = bank.withdraw(300.00, balance);
        balance = bank.withdraw(1500.00, balance); // should fail
        balance = bank.deposit(200.00, balance);

        System.out.printf("Final Balance: $%.2f%n", balance);
    }
}