package Oops;

public class Mage extends Character{
	 public Mage(int health,int level) {
	        super(health,level);
	    }

	    public void useMagic() {
	        System.out.println("Mage uses magic!");
	        System.out.println("Level: " + level);  
	    }
}
