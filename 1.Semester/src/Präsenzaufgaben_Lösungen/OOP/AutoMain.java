package Präsenzaufgaben_Lösungen.OOP;
public class AutoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto a1 = new Auto("BMW", 240, 50);
		Auto a2 = new Auto("VW", 190, 60);
		System.out.println("a1 ist ein " + a1.getMarke()
				+ " mit der HÃ¶chstgeschwindigkeit " + a1.getHoechstG()
				+ "km/h und der aktuellen Geschwindigkeit " + a1.getAktuelleG()
				+ "km/h und hat folgende ID-Nummer: " + a1.getId());
		System.out.println("a2 ist ein " + a2.getMarke()
				+ " mit der HÃ¶chstgeschwindigkeit " + a2.getHoechstG()
				+ "km/h und der aktuellen Geschwindigkeit " + a2.getAktuelleG()
				+ "km/h und hat folgende ID-Nummer: " + a2.getId() );
		
		System.out.println("Die Anzahl an erstellten Objekten beträgt:" + Auto.getAnzahlAnAutos());
		
		Auto a3 = new Auto();
		System.out.println("a3 ist ein " + a3.getMarke()
				+ " mit der HÃ¶chstgeschwindigkeit " + a3.getHoechstG()
				+ "km/h und der aktuellen Geschwindigkeit " + a3.getAktuelleG()
				+ "km/h ");
		a3.setAktuelleG(40);
		a3.setAktuelleG(60);
		a3.setAktuelleG(-20);
		System.out.println("a3 fÃ¤hrt jetzt " + a3.getAktuelleG() + "km/h.");
		System.out.println("Die Anzahl an erstellten Objekten beträgt:" + Auto.getAnzahlAnAutos());
	
	}

}
