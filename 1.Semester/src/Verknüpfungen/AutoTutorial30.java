package Verknüpfungen;

public class AutoTutorial30 {
	
	private String autoFarbe;
	private int Pferdestärke;
	static int navi;	//Statisch. Einmal verändert, Mehrmals nutzbar als die wert die eingetragen wurde.
	
	public AutoTutorial30(String farbe, int ps) //Konstruktor 
	{
		this.autoFarbe = farbe;
		this.Pferdestärke = ps;
	}
	public void updateNavi(int navigationssystem) //setter
	{
		this.navi = navigationssystem;
	}
	public int getNavi()						 //getter		
	{
		return navi;
	}

	//Regeln für Konstruktor:
	//1.Sie tragen immer den Namen der Klasse.
	//2.Sie können überladen werden (mehrere Konstruktoren).
	//3.Sie besitzen keinen Rückgabewert.
}
