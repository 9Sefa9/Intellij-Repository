//Hi Daniel =)  Ich hab deine Fehler erkannt und wird sie mal versuchen zu erklären: 

import java.util.*;
public class Exe {
        
 // Scanner ist richtig! allerdings am falschen platz erstellt. Runter damit in die Main Methode.Denn da nutzt du sie ja auch. 
// eine Instanz-Objekt ist nicht hier Sinnvoll. Nur wenn du sagen mÖchstest: Alle Methoden etc. sollen meinen Scanner nutzen können
	 
	// ich habs umbennant, weil es für dich einfacher ist zu verstehen. ( scan zu eingabe)
	Scanner eingabe = new Scanner(System.in);  
        

        //Hauptmethode. Zwei Zahlen kriege ich und sende sie zur Methode --> Richtig!
        public static void main (String[] args) {

		 
                System.out.println("Bitte geben Sie die Basis ein:");
                int n = eingabe.nextint();  //Liest die Zahl n ein --> funktionier noch nicht, weil Scanner nicht in der main methode

                System.out.println("Bitte geben Sie den Exponenten ein:");
                int x = eingabe.nextint();  //Liest die Zahl x ein --> funktioniert auch nicht, weil ""			""  		""


                System.out.println("Das Ergebnis lautet: ");
                System.out.print(power (n,x));	// bis hierhin richtig.  Vergiss jetzt bloß nicht: N ist der BASIS und X der EXPONENT
        }

        
        public static int power(int n, int x) {
                if(n == x)	//Das ist Falsch. hier sagst du: wenn der Exponent und der Basis gleich gleich sind, dann mache irgendwas.
				//hir muss stehen: if(x == 0) dann return 1     da: irgendeineZahlHOCH0 immer = 1 ist.  Sogar 3276234 hoch 0 ist immer 1.
				// egal was HOCH 0 ist immer 1.(es ist so, weil es eine allgemeingültige vorraussetzung in der mathematik ist. Also nichts neues)
				// somit returnen wir nicht den BASIS sondern nur eine 1 
				// schau dir nochmal die Potenzgesetze an =) 
                        return n;		//ändern zu 1 

						
                        //return power( (n)*(x-1) );
                        //return power((n*current), (x-1)); //Ergebnis ist 6!!!!
                        //return power ((n*n),(x-1)); Ergebnis ist 256
                else{
					
						// hier kommt die Rekursive funktion(syntax riichtig) aber gehe doch mal die schritte durch:
						//sobald du n * n machst, bekommst du eine andere zahl raus. und die Zahl wird wieder mit sich selbst multipliziert.
						//das ist leider nicht ganz richtig.    (x-1) ist richtig. 
						// grundgedanke: ich ziehe eine 1 aus dem exponenten ab und multipliziere das ganze nochmal mit dem Basis.
						// die formal ist:  n*power(n,x-1);
						
	// beispiel: 2 hoch 3 (grundgedanke: ziehe -1 vom expoenenten ab) 2 hoch 2 (und multipliziere es mit der Basis) 2* (2hoch2) 
	// (ziehe -1 vom exponenten ab) 2hoch1  (und multipliziere sie mit der Basis).......und so weiter..... =  2*2*2
	// bitte beachte:   deine Rekurisve funktion RETURNT eine Zahl! und das ist die Rekursive Funktion. Das heißt, wir multiplizieren eine Zahl
	// ,in dem falle N, mit der Zahl: power(n,x-1)
						
                        return power((n*n),(x-1));} 

        }
		/* das ganze sieht so aus: 
		if(x == 0){
			return 1;
		}else{
			return n * power(n,x-1);
		}

		
		wie sieht es eigentlich mit zahlen aus, die eine negative exponent haben ?  nunja, dann verwenden wir die formel: 
		return EINS geteilt durch / n*power(n,x-1)
		
		So das wars auch schon:     Ich lege dir wirklich ans herz, dass du dir die Potenzregeln anschaust. einfach mal Googlen.
		Die werden dich sehr sehr sehr stark verfolgen(vorallem in mafin1 und dima)
		Wir sehen uns, =)
		*/
}





