public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);

        myAccount.withdraw(300);

        myAccount.checkBalance();
    }
}
