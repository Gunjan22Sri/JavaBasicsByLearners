class BankAccount 
{
    int balance = 1000;
    void deposit(int amount) 
    {
        balance += amount;
        System.out.println("Deposited " + amount);
    }
    void withdraw(int amount) 
	{
          if (amount <= balance) 
	  {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
          } 
	  else 
	  {
            System.out.println("Insufficient balance!");
          }
       }
    void checkBalance() 
    {
        System.out.println("Current Balance " + balance);
    }
}

public class BankAccountMain 
{
    public static void main(String[] args) 
{
        
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.checkBalance();
    }
}
