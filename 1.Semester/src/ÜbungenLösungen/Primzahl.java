package ÜbungenLösungen;
import java.util.Scanner;
public class Primzahl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		boolean isPrime = true;

		/*
		 * Nun verwenden wir eine Schleife, die von 1 bis a laeuft, um jede
		 * dieser Zahlen auf Teilerfremdheit mit a zu ueberpruefen. Wenn die
		 * Modulo-Operation der Zahl a mit dem momentanen Wert der
		 * Schleifenvariable i null ergibt, dann ist i ein Teiler von a. Der
		 * Zaehler fuer die Anzahl der Teiler wird dann inkrementiert.
		 */

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
				System.out.println(isPrime);
				
			}
		}
		
		/*
		 * Nun wird ausgegeben, ob es sich um eine Primzahl handelt.
		 */

		if( isPrime )
			System.out.println(isPrime);

		/*
		 * Nota bene: Hier wurde angenommen, dass die 1 keine Primzahl ist, da
		 * eine Primzahl per definitionem exakt zwei Teiler hat. Moechte man auch
		 * die 1 als Primzahl erkannt bekommen aendert man obige Zeile zu:
		 * System.out.println(teiler <= 2);
		 * Ferner beachte man, dass in der Klammer, die fuer die Konsolenausgabe
		 * verantwortlich ist, ein boolscher Ausdruck (Vergleich) steht.
		 */

	}

}
