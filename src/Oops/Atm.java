package Oops;

public class Atm {
	private int balance , originalPin;
	public Atm(int amount ,int pin) {
		this.balance = amount;
		this.originalPin = pin;	
	}
	 public void getcheckBalance(int pin) {
		 if(validatePin(pin, "Wrong pin !!!")) {
			 System.out.println("current balance: " + balance);			 
		 }

	 }
	 public void withdraw(int amount , int pin) {
		 if(balance == 0 || balance < amount) return;
		 balance -= amount;
		 if(validatePin(pin, "Pin is wrong , deny withdrawl!!!")) {
			 System.out.println("Current balance: " + balance);
		 }
	 }
	 
	 private boolean validatePin(int pin, String errorMsg) {
		 if (originalPin != pin) {
			 System.out.println(errorMsg);
			 return false;			 
		 }
		 return true;
	 }
}
	

