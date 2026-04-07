package Oops;

public class Character {
	private int health;
	protected int level;
	final int MAX_HEALTH = 100;
	//protected int health;
	public Character(int health,int level) {
		this.health = health;
		this.level = level;
	}
	public int getHealth() {
		return health;
	}
}
