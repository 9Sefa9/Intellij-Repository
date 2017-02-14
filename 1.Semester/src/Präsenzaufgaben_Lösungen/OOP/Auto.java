package Präsenzaufgaben_Lösungen.OOP;
public class Auto {

	private String marke = "Generische Marke";
	private double hoechstG = 200;
	private double aktuelleG;
	private int id;
	private static int anzahlAnAutos =0;

	public Auto() {
		this.id = ++anzahlAnAutos;
	}

	/*
	 * Dieser Konstruktor ignoriert unsere Pruefbedingungen fuer die
	 * Geschwindigkeit. Um sie durchzusetzen, koennten wir z.B. innerhalb des
	 * Konstruktors statt der direkten Zuweisungen die Setter nutzen. Die Setter
	 * koennen allerdings in den Subklassen ueberschrieben werden. Um dies zu
	 * verhindern, koennten wir die Setter zusaetzlich mit dem Schluesselwort
	 * 'final' versehen.
	 */
	public Auto(String marke, double hoechstG, double aktuelleG) {
		this.marke = marke;
		this.hoechstG = hoechstG;
		this.aktuelleG = aktuelleG;
		this.id = ++anzahlAnAutos;
	}
	

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public double getHoechstG() {
		return hoechstG;
	}

	public void setHoechstG(double hoechstG) {
		if (hoechstG >= 0)
			this.hoechstG = hoechstG;
	}

	public double getAktuelleG() {
		return aktuelleG;
	}

	public void setAktuelleG(double aktuelleG) {
		if (aktuelleG <= hoechstG && aktuelleG >= 0)
			this.aktuelleG = aktuelleG;
	}
	public int getId() {
        return id;

	}
	public static int getAnzahlAnAutos() {
        return anzahlAnAutos;
    }
	
		

}
