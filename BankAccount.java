class BankAccount {
    int balance = 1000;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount);
        } else 
            System.out.println("Insufficient balance!");
    }

    void checkBalance() {
        System.out.println("Current balance: Rs." + balance);
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.checkBalance();
    }
}
