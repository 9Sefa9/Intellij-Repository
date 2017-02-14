package PanikRunde;

public class FireMage extends Mage {
	private int flameHeat;
	
	public FireMage(){
//		this(60);  //setzt  magicka = 60 überlade ein anderes Kosntruktor von dieser klasse
		super(60);
		this.flameHeat = 100; // setzt flameHeat = 100
	}
	
	public FireMage(int magickat){
		super(magickat); // der magicka aus super ist jetzt magickat
		this.flameHeat = 100;
	}
	public void setFlameHeat(int flameHeat){
		this.flameHeat = flameHeat;
	}
	public void levelUp(){
		super.levelUp();  // nur so darf aufgerufen werden !
		this.flameHeat += 20;
	}
	public int getFlameHeat(){
		return this.flameHeat;
	}
}
