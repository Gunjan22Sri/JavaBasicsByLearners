class BankAccount {
    private int balance;

    // Constructor
    public BankAccount() {
        balance = 1000;
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Create object

        account.deposit(500);     // Deposit ₹500
        account.withdraw(300);    // Withdraw ₹300
        account.checkBalance();   // Display final balance
    }
}
