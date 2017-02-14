package TutorialFolder;

public class Tutorial22Konstruktor {
	private String bossName;
	
	public Tutorial22Konstruktor(String name)
	{
		this.bossName = name;
	}
	public void schreibeBossName()
	{
		System.out.println(bossName+ "Ist dein boss!");
	}

// in der main methode dann: 
/*
	Tutorial22Konstruktor objekt1 = new Tutorial22Konstruktor("Pickachu");
	Tutorial22Konstruktor objekt2 = new Tutorial22Konstruktor("Killer");
	
	objekt1.schreibeBossName();
	objekt2.schreibeBossName();
*/
}
/*Der Konstruktor ist eine Methode die den 
 * gleichen Namen hat, wie die Klasse des 
 * Konstruktors.
 *Wenn man ein Objekt von einer Klasse 
 *erzeugt und diese Klasse einen Konstruktor hat, dann wird dieser bei der Erzeugung des Objektes aufgerufen.
*/