class BankAccount {
    private int balance = 1000;
    private int amount = 0;

    public void deposit(int amount) {
        if (amount > 0)
            System.out.println("Deposited: $" + (balance += amount));
        else
            System.out.println("Invalid deposit amount.");
    }

    public void withdraw(int amount) {
        if (amount <= balance)
        {
            this.amount = amount;
            System.out.println("Withdrawn: $" + (this.amount));
        }
        else
            System.out.println("Insufficient balance.");
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + (balance - amount));
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(345);
        account.withdraw(1);
        account.checkBalance();
    }
}
