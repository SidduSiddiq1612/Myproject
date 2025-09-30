package Day9HW;
public class BankDemo {
    public static void main(String[] args) {
        System.out.println("Creating a Bank Account");
        BankAccount myAccount = new BankAccount(123456, "siddiq", 5000.0);
        myAccount.displayAccountInfo();

        System.out.println("\nDepositing Rs.1500 ");
        myAccount.deposit(1500.0);
        myAccount.displayAccountInfo();

        System.out.println("\nWithdrawing Rs.2000 ");
        myAccount.withdraw(2000.0);
        myAccount.displayAccountInfo();

        System.out.println("\nWithdrawing Rs.5000 (Insufficient Amount)");
        myAccount.withdraw(5000.0);
        myAccount.displayAccountInfo();


    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdraw of Rs." + amount + " successful.");
            } else {
                System.out.println("Insufficient Balance.");
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs." +balance);
    }
}

