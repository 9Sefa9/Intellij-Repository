package Übung;

public class Lehrer extends Schulverwaltung {
	public int alter = 30;
	public int fächeranzahl = 2;
	public  String[] fach = {"Mathe", "Englisch", "Deutsch"};
	
	public Lehrer(int alter, int fächerzahl){
		super(alter,2,fach);
		
		
	
	}
}
