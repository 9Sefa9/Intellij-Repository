package Verknüpfungen;

public class Tutorial15VerknüpfteKlasseSTART {

	public static void main(String[] args) {
		Tutorial15VerknüfteKlasseENDE laptop = new Tutorial15VerknüfteKlasseENDE();
		laptop.verbindung();
		//4 ersteinmal wird ein Variable laptop erstellt um ein Objektzu erstellen!: Tutorial15VerknüfteKlasseENDE.
		//5. Dieses Objekt verwenden wir jetzt, um uns zugang zu Tutorial15VerknüfteKlasseENDE zu verschaffen/verwenden
		int var1 = laptop.berechnen(2, 4, 6);		// 6 mann kann diese auch zu einer Variable zuordnen!!
		System.out.println(var1);
	
	
	} 	
	/*public class Laptop {
 
    public static void main(String[] args) {
        Internet internetObjekt = new Internet();		1hier gilt: greife zur Klasse Internet ein und erstell ein Objekt "internetObjekt"
        internetObjekt.verbinden();						2ruf die Methode verbinden auf mit: objektname.verbinden();
    }
 
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
