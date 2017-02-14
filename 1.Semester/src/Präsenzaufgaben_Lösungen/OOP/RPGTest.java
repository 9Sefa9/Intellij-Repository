package Präsenzaufgaben_Lösungen.OOP;
import java.util.Scanner;
public class RPGTest {
	
	
	/*
	 * Klasse zum Testen der Held- und Monsterklasse
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		Held Hans = new Held ();
		Monster Ratte = new Monster ();
		
		
		System.out.println("Die Lebenspunkte betragen " + Hans.getHealth() + " für Hans und " + Ratte.getHealth() + " für Ratte");
		System.out.println(Hans.getIsAlive());
		Hans.printItems();
	
		/*
		 * Gameloop wird gesteuert über die boolean-Variable isAlive aus der LivingThing-Klasse
		 */
		
		while (Hans.getIsAlive() == true && Ratte.getIsAlive() == true) {
			
			System.out.println("Was möchtest du tun?");
			String eingabe = scan.nextLine();
			
			
			if (eingabe.equals("angreifen")) {
				Hans.angreifen (Ratte);
				System.out.println("Ratte HP= " +Ratte.getHealth());
				Ratte.angreifen(Hans);
				System.out.println("Hans HP= " + Hans.getHealth());
				
			
			}else if (eingabe.equals("trinken")) {
				Hans.trinkenTrank();
				Hans.removeItems();
				Hans.printItems();
				System.out.println("Hans HP= " + Hans.getHealth());
				Ratte.angreifen(Hans);
				System.out.println("Ratte HP= " +Ratte.getHealth());
				System.out.println("Hans HP= " + Hans.getHealth());
			} else 
				continue;
			
		}
		System.out.println("Glückwunsch du hast gewonnen");
		Hans.giveExp(Ratte);
		System.out.println("Du erhälst "+ Hans.getExp()+ " XP");
		Hans.setRank();
		System.out.println("Deine neue Stufe ist " +Hans.getRank());
		Hans.printItems();
		
	}

}
