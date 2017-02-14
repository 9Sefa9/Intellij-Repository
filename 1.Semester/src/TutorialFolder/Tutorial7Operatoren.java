package TutorialFolder;
import java.lang.Math;
import java.util.Scanner;
public class Tutorial7Operatoren
{

	public static void main(String[] args) 
	{
		int fahrer, autos, partywillige;
		fahrer = 3;						// das ganze kann man auch so aufschreiben!
		autos = 2;
		partywillige = 8;
		
		System.out.println("Alle Personen: " + (fahrer + partywillige));		//plus rechnung
		System.out.println("‹briges Fahrer: " + (fahrer - autos));				//minus rechnung
		System.out.println("Leute pro Auto: " + ((fahrer+partywillige)/autos)); // / = teilung!
		System.out.println("Sitzpl‰tze: " + (5*autos));							// mal rechnung
		System.out.println("Leute ohne Anschnallgurt: "+((fahrer+partywillige)%(autos*5)));
		System.out.println("Exponentieren, weils spaﬂ macht: " + Math.pow(partywillige,fahrer));
		// % Modula entspricht dem rest! das heiﬂt zum beispiel ist 10 % 3 = 1 
		// denn die 3 passt nur 3 mal in die 10 rein ! also rest 1 !
		// Modulo ist zugleich die divison zweier Ganzzahlen!
		// um exponentieren zu kˆnnen, muss die Formel Math.pow(); gelten! also siehe import!
		// die pow methode ist eine Double methode ! das heiﬂt, dass die integer in Double umgewandelt werden!
		
	
	}
}