package Oops;


public class Main {
	public static void main(String[]args) {
		// class    vn   keyword  constructor
		//BankAccount ac = new BankAccount("Rohit",5);
		//BankAccount ac2 = new BankAccount("Rajib",0);
		//Atm ac = new Atm(500,123);
		//ac.getcheckBalance(124);
		//ac.withdraw(200 ,123);
		//Warrior w = new Warrior(100,50);
        //w.attack();
        //w.getHealth();
        //Mage m = new Mage(180,20);
       // m.useMagic();
       // System.out.println("Warrior Health: " + w.getHealth());
		
		// FOR INHERINATCE ----
		int a = 30; int b = 20;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.substraction(a, b);
		demo.multiplication(a, b);
		
		//student s = new student(20);
		//if i use Constructor then don't write s.setId(20);
		//ac.getBalance();
		//ac.deposit(5);
		//ac.withdraw(3);
		
		//ac2.getBalance();
		//ac2.deposit(50);
		//ac2.withdraw(30);
		
	}

}
