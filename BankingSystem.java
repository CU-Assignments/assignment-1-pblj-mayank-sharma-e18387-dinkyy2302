import java.util.Scanner;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(name, accountNumber, balance);

        System.out.print("Deposit Amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Withdraw Amount: ");
        acc.withdraw(sc.nextDouble());

        sc.close();
    }
}
