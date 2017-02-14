package Übung;

public class Schulverwaltung{
	public int Dienstalter;
	public int anzahlFächer;
	public String[] fächer  = new String[anzahlFächer-1];
	
	public Schulverwaltung (int alter, int fächeranzahl, String []dieFächer){
		this.Dienstalter = alter;
		this.anzahlFächer = fächeranzahl;
		this.fächer = dieFächer;
	}
}
