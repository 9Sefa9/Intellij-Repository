package ÜbungenLösungen;
public class Vector3 {

	private float x;
	private float y;
	private float z;
	
	// Standardkonstruktor (setzt alle Instanzvariablen auf 1 [Vorgabe])
	Vector3() {
		// f kennzeichnet hier, dass es sich um einen float-Wert handelt
		this(1f, 1f, 1f);
	}
	
	// Konstruktor, um die Werte der Instanzvariablen individuell zu setzen
	Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// Weist allen Instanzvariablen den selben Wert zu
	Vector3(float zahl) {
		this(zahl, zahl, zahl);
	}
	
	// Ueberschreibt die toString()-Methode aus Object
	// und gibt die Werte der Instanzvariablen aus
	public String toString() {
		return this.x + "," + this.y + "," + this.z;
	}
	
	// main-Methode zum testen der Klasse
	public static void main(String[] args) {

		Vector3 firstVector = new Vector3();
		Vector3 secondVector = new Vector3(12.f, 0.5f, 11.f);
		Vector3 thirdVector = new Vector3(2.f);
		Vector3 anotherVector = new Vector3(3.f);
		
		// Ausgabe muss lauten: 1.0,1.0,1.0
		System.out.println(firstVector);

		// Ausgabe muss lauten: 12.0,0.5,11.0
		System.out.println(secondVector);
		
		// Ausgabe muss lauten: 2.0,2.0,2.0
		System.out.println(thirdVector);
		
		// Ausgabe muss lauten: 3.0,3.0,3.0
		System.out.println(anotherVector);
	}
}
