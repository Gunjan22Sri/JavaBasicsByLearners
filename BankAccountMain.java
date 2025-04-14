<<<<<<< HEAD
class BankAccount{
	int balance = 1000;

public void deposit(int amount){
	if(amount > 0){
		balance = balance + amount;
		System.out.println("Amount Deposited: " + amount);
	}else{
		System.out.println("Invalid amount deposited");		
}
	}
public void withdraw(int amount){
	if(amount <= balance){
		balance -= amount;
		System.out.println("Withdrawn amount: "+ amount);
		
}else{
	System.out.println("Insufficient balance for withdraw");
}


}

public void checkBalance(){

	System.out.println("Current Balance: " + balance);
}

}

public class BankAccountMain{
	public static void main(String args[]){
		BankAccount bank = new BankAccount();
		
		bank.deposit(500);
		bank.withdraw(300);
		bank.checkBalance();


}


=======

 class BankAccount {
  
    int balance;
    public BankAccount() {
        balance = 1000;
    }

   
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

  
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Error: Insufficient balance.");
        }
    }


    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
              BankAccount account = new BankAccount();
        account.deposit(500);

             account.withdraw(300);

       
        account.checkBalance();
    }
>>>>>>> 7db4aa4 (java programs)
}