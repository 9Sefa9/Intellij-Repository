package PanikRunde;

public class spiel {
	private String klasse;
	private int leben;
	private String spieler;

	public spiel(String Klasse, String Spieler, int Leben) {
		this.klasse = Klasse;
		this.leben = Leben;
		this.spieler = Spieler;
		
	}
	public void setKlasse(String kämpfer){
		this.klasse = kämpfer;
	}
	public String getKlasse(){
		return this.klasse;
	}
	
	public String toString(){
		return klasse+" "+leben+" "+spieler;
	}
}
