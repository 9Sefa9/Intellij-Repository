package PanikRunde;
     // abstracte Klasse 
public abstract class Mage {
	private int magicka;
	
	public static void main(String[] args){
		//die oberklasse muss immer links stehen. heir steht sie auch links 
		Mage paolo = new FireMage(); //firemage muss von mage extenden weil ein hund passt ine in Säugetier. aber nicht umgekehrt!  speziellere in das allgemeinere reinpacken
									// es muss so sein, da paolo kein instanz erstellen darf(abstrakte klasse!) wobei paolo ein objekt vom typ Mage ist
		int m = paolo.getMagicka(); // greift auf Mage also superklasse
		
		FireMage alfred = new FireMage(85);
		
		alfred.setMagicka(90);
		
		alfred.setFlameHeat(180);
		
		//firemage gecastet an paolo
		((FireMage) paolo).levelUp(); // paolo ist gespeichert im typ mage und ist eigentliche ein mage. 
		
		//  aber paolo wird gecastet von mage  zu Firemage 
		System.out.println(((FireMage) paolo).getFlameHeat()); // jetzt ist paolo ein FireMage und kann auf FlameHeat zugreifen
													  // toString kann keine Integer werte Liefern!
	}
	public Mage(int magicka){
		this.magicka = magicka;
	}
	
	public void setMagicka(int magicka){
		this.magicka = magicka;
	}
	public int getMagicka(){
		return this.magicka;
	}
	public void levelUp(){
		this.magicka += 10;
	}
}
