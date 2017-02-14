package KontrollUndFunktionsstrukturen;
import java. util.Scanner;
public class Calc {
	
	/*
	 * Dieses Programm stellt einen einfachen Taschenrechner dar, der die vier Grundrechenarten mit Integerzahlen löst. 
	   Es wurden if-else-Zweige verwendet
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bitte zwei Zahlen eingeben");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Bitte Operator eingeben (1 für +, 2 für -, 3 für *, 4 für /");
		int operator = scan.nextInt();
		
		if (operator == 1) {
			System.out.println(a+b);
		} else if ( operator == 2) {
			System.out.println(a-b);
		} else if (operator == 3) {
			System.out.println(a*b);
		} else if (operator == 4) {
			
			if  (b != 0) {
				System.out.println((a/b));
			} else {
				System.out.println("Division durch null");
			}
		} else 
			System.out.println("Keine gültige Operation, bitte von vorne starten!");
		
		
		
	}

}
