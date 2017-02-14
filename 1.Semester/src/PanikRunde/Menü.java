package PanikRunde;
import java.util.*;
public class Menü {
	
	public static String charakter;
	public static String beruf;
	public static int hp;
	
	public static void main(String[] args){
		int SpielEingabe;
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Willkommen!\n");
		System.out.println("1.Spiel Starten\n2.Beenden");
		SpielEingabe = eingabe.nextInt();
		//funktioniert nur mit int char String bedinungen!
		switch(SpielEingabe){
		case 1:  Scanner eingabe2 = new Scanner(System.in);
				
				charakter= eingabe2.nextLine();
				System.out.println(charakter);
				beruf    = eingabe2.nextLine();
				System.out.println(beruf);
				hp		 = eingabe2.nextInt();
				spiel s = new spiel(charakter,beruf,hp);
				System.out.println(s); //toString brauhct man nicht, sondern nur sicherstellen das man die überschreibt
			
				break;
				
		case 2: System.out.println("Spiel wurde beendet!");
				
		
		default: System.out.println("Ungültige Eingabe!");
		
		
		}
		
	}
	
	
}
