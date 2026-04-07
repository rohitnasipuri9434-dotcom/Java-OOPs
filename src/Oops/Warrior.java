package Oops;

public class Warrior extends Character {
	public Warrior(int health,int level) {
		super(health,level);
	}
		 public void attack() {
		        System.out.println("Warrior attacks with sword");
		        System.out.println("Level: " + level);
		    }
}

		 


