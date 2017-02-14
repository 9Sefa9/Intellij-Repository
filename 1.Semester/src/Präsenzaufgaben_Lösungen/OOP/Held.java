package Präsenzaufgaben_Lösungen.OOP;
import java.util.ArrayList;


public class Held extends LivingThing{

	/*
	Die Methoden die -items im Namen tragen, kÃ¶nnen fÃ¼rs erste ignoriert werden, da sie mit Generics arbeiten, welche erst zum Schluss der 
	Veranstaltung behandelt werden.
	
	*/

	private ArrayList<String> items = new ArrayList<String>();
	
	public void addItems ( String s) {
		
		items.add(s);
		
	}
	
	public void removeItems () {
		
		items.remove(0);
	}
	
	public void printItems () {
		
		if (items.size() >0) {
		for (Object o : items) {
			System.out.println(o);
		}
		} else {
			System.out.println("Du hast keinen Trank mehr");
		}
	}
	
	
	public void trinkenTrank () {
		
		
		setHealth(getHealth() + 50);
		
		
	}
	
	public Held () {
		
		setHealth(20);
		setRank ();
		setExp (0);
		setIsAlive (true);
		addItems ("Trank");
	}
	
}
