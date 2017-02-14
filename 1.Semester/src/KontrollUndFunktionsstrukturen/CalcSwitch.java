package KontrollUndFunktionsstrukturen;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcSwitch {

	/*
	 * Diesen Programm stellt einen einfachen Taschenrechner dar, der die vier Grundrechenarten mit Integerzahlen löst. 
	 * Es wurde ein switch-Case verwendet bzw. eine do-while-Schleife implementiert, um mehrerer Eingaben zu tätigen.
	 */

	public static void main(String[] args) {
		
		try{
		getCalculation ();
		}
		catch(InputMismatchException e){
			System.out.println("MAIN:Input Mismatch Exception wurde gefunden!");
			
		}
	
		
	}
	
	public static void getCalculation(){
		
		
		Scanner scan = new Scanner (System.in);
		
		int a;
		int b;
		
		String operator;
		System.out.println("Bitte Operator eingeben. Zum Anhalten bitte exit eingeben");
		// schleife wurde eingefügt um solange weiter zu achenw ie es nur geht.
		
		do {
			operator = scan.nextLine();
			
			if (!operator.equals("exit")) {
			System.out.println("Bitte zwei Zahlen eingeben");
			a = scan.nextInt();
			b = scan.nextInt();
			
			switch (operator) {  // anscheinend braucht die case verzweigung keine unbedingte geschweifte Klammer
				case "+": System.out.println(a+b);
				break;
				case "-": System.out.println(a-b);
				break;
				case "*": System.out.println(a*b);
				break;
				case "/": 
					if (b ==0) {
						System.out.println("Nope");
					}else {
						System.out.println(a/b);
					}
					
				break;
				default : 
					
					System.out.println("Nope");
				}
			} else
				break;
			System.out.println("Bitte Operator eingeben. Zum Anhalten bitte exit eingeben");
		
		}while (!(operator.equals("exit")));
		
		}
		
	
	}


