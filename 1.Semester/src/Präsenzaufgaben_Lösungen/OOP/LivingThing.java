package Präsenzaufgaben_Lösungen.OOP;
public class LivingThing {

	private int health;
	private int rank;
	private int exp;
	private boolean isAlive;
	
	public void setIsAlive (boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public boolean getIsAlive() {
		return isAlive;
	}
	
	
	public void setHealth (int health) {
		
		if (health >0) {
		this.health = health;
		}
		else 
			this.isAlive = false;
			
		
	}
	
	public int getHealth () {
		return health;
		
	}
	
	public void setRank () {
		
		if (getExp() <50)
			this.rank = 1;
		else if (getExp() >= 50) 
		this.rank =2;
		
	}
	
	public int getRank () {
		return rank;
	}
	
	public void setExp (int exp) {
		this.exp = exp;
	}
	
	public int getExp () {
		return exp;
	}
	
	public void angreifen (LivingThing a) {
		a.setHealth (a.getHealth() - 10);
	}
	public void giveExp (LivingThing a) {
		this.exp += a.getExp();
	}
}
