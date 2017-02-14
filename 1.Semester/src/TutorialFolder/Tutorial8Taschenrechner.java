package TutorialFolder;
import java.util.Scanner;
public class Tutorial8Taschenrechner {

	public static void main(String[] args) {
	  double zahl1, zahl2, ergebnis;	//nicht nur ganzzahlige sondern auch gerundete !
	  Scanner tippen = new Scanner(System.in); //Strg+shift+o fügt alle gebrauchten imports ein!
	  
	  
	  System.out.println("Erste Zahl eingeben!: ");
	  zahl1 = tippen.nextDouble();   //double wird in zahl 1 gespeichert.
	
	  System.out.println("zweite Zahl eingeben!: ");
	  zahl2 = tippen.nextDouble();	//wenn wir mit Int arbeiten würden,dann wäre es nextInt();!
	
	  
	  
	  
	  ergebnis = zahl1 + zahl2;
	  System.out.println("dein Ergebnis bei Addition!: "+ergebnis);
	  // das ganze für * mal!
	  
	  ergebnis = zahl1*zahl2;
	  System.out.println("dein Ergebnis bei Multiplikation: "+ergebnis);
	  // ergebnis wird überschrieben!!  von addiition auf multiplikation
	
	  
	  
	
	}

}
