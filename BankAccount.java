public class BankAccount {
    int balance = 1000;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit:" + amount);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw:" + amount);
        } else {
            System.out.println("Not Sufficient balance in your account:" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance:" + balance);
    }
}
