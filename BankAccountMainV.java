class BankAccount{
    // Instance variable
    double  initialBalance = 1000;

    // Method for deposit
    void deposit(int amount) {
        initialBalance += amount;
    }   

    // Method for withdraw
    void withdraw(int amount) {
        if(initialBalance >= amount){
            initialBalance -=amount;
        }else{
            System.out.println("You dont have suffiecient amount, your current amount is: "+initialBalance);
        }
    }

    //Print current balance
    void checkBalance(){
        System.out.println("Current bank balance is: "+ initialBalance);
    }
}

// Main class
class BankAccountMainV {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposit(2000);
        // account.withdraw(500);
        account.withdraw(3500);
        account.checkBalance();
    }
}