package Oops;

public class BankAccount {
	private String accountHolderName;
	private int balance;
	public BankAccount (String holderName , int money) {
		this.accountHolderName = holderName;
		this.balance = money;
	}
		public void getBalance() {
			System.out.println(accountHolderName + "'s Current Balanace: " + balance);
		} 
		public void deposit(int money) {
			balance += money;
			System.out.println("Deposited amount: " + money);
			getBalance();
		}
		public void withdraw(int money) {
			if(balance == 0 || balance < money) return;
			balance -= money;
			System.out.println("Withdrwal amount: " + money);
			getBalance();
			
		}
		
	
}
