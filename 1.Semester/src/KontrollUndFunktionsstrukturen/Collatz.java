package KontrollUndFunktionsstrukturen;
import java.util.Scanner;
public class Collatz {
	
	
	/*
	 * Dieses Programm geht den Collatz-Algorithmus durch. Es werden eine iterative, sowie zwei rekursive Methoden dazu vorgestellt.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Bitte eine Zahl zum Testen eingeben");
		int i = scan.nextInt();
		collatzIterativ (i);
		
		
		
	}
	public static void collatzIterativ(int x) {
		
		int zähler=0;
		
		while (x !=1) {
			
			if (x %2 ==0) {
				x = x/2;
				
			}else {
				 x= 3*x+1;
				
			}
			zähler++;
		}
		
		
		System.out.println(zähler);
	}
public static int collatzRekursiv (int n) {
		
		if (n == 1) {
			return 0;
		} else if (n % 2 == 0) {
			
			return 1 + collatzRekursiv (n = n/2);
				
		} else {
			
			return 1 + collatzRekursiv (n = 3*n +1);
				
		} 
	
	} 
	
	public static int collatzRekursiv (int n, int nrSteps) {
		
		if (n == 1) {
			return nrSteps;
		} else if (n % 2 == 0) {
			
			return collatzRekursiv (n = n/2, nrSteps+1);
	
		} else {
			
		return collatzRekursiv (n = 3*n +1, nrSteps+1);
			
		} 
	
	}
}
