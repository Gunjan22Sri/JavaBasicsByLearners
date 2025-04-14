public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.checkBalance();
    }
}

class BankAccount {
    private int balance = 1000;  // Initial balance
    void deposit(int amount) {
        balance += amount;
        System.out.println("Rs" + amount + " deposited.");
    }
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    void checkBalance() {
        System.out.println("Current balance: Rs" + balance);
    }
}
