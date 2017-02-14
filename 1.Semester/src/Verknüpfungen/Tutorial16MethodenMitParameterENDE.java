package Verknüpfungen;

public class Tutorial16MethodenMitParameterENDE {
	
	public void verbindung(String Name){
		System.out.println("Sie sind verbunden!! "+Name); // 1. erstmal wurde eine Neue klasse Internet erzeugt!
	}							//2 durch Public kann man die Klasse für andere Klassen zugänglich machen!
							//3void : gleich kein rückgabewert ! s wird nur durchgeführt!
        
    public int berechnen(int zahl1, int zahl2){  // 4wenn wir eine Methode haben die einen Wert zurück liefert,
    	int ergebnis = zahl1+zahl2;												// 5dann brauchen wir ein Reutrn statement!
    	return ergebnis;		//es geht auch mal geteilt usw..
    }

}

// Zusammenfassung:  Wir haben in der Klasse ENDE einmal Public void Verbindung und Public int Berechnen !  die kann man nutzen in der Main methode!