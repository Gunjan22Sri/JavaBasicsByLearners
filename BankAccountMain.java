class BankAccount {
    int balance;  

    public BankAccount() {
        balance = 1000;     }

       public void deposit(int amount) {
        balance = balance + amount;  
    }

       public void withdraw(int amount) {
        if (amount <= balance) {            
            balance = balance - amount;        
             } else {
                   System.out.println("Error: Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs." + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
      BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
    }
}
