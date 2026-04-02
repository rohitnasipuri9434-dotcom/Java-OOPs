package Oops;

public class Main {
	public static void main(String[]args) {
		// class    vn   keyword  constructor
		BankAccount ac = new      BankAccount("Rohit",5);
		BankAccount ac2 = new     BankAccount("Rajib",0);
		
		//student s = new student(20);
		//if i use Constructor then don't write s.setId(20);
		ac.getBalance();
		ac.deposit(5);
		ac.withdraw(3);
		
		ac2.getBalance();
		ac2.deposit(50);
		ac2.withdraw(30);
		
	}

}
