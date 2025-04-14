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


}