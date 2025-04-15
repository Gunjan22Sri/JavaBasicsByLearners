//Create a class BankAccount with an initial balance of ₹1000.
//Add the following methods:
//deposit(int amount) – adds money to balance
//withdraw(int amount) – subtracts if sufficient balance, else prints error
//checkBalance() – prints current balance
//Create a BankAccountMain class where you:
//Create an object
//Deposit ₹500
//Withdraw ₹300
//Display final balance

class BankAccount {
    int balance;

    BankAccount() {
        balance = 1000;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Cannot withdraw " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.checkBalance();
    }
}
