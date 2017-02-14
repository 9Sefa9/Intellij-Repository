package LernPaket;

import java.util.*;


public class Power {
	/*
	 * Schreiben Sie eine Klasse Power und speichern Sie diese als Power.java.
	 * Ihr Programm bekommt die zwei Integer x und n in genau dieser Reihenfolge
	 * uber die Standardeingabe und ¨ soll auf der Standardausgabe das Ergebnis
	 * von n x (genau eine Zahl) anzeigen. Nutzen Sie Rekursion!
	 */
	
	public static double power(int x, int n){
		if(x == 0) return 1.0;
		
		
		else {
			if(x<0){
				int sum = -1* x;
				
				return 1/ (n*power((sum-1), n));
			}
			else 
			return n*power(x-1,n);
		}
		
	}
	
	
	public static void main(String[] a){
			Scanner e = new Scanner(System.in);
		
			int n = e.nextInt();
			int x = e.nextInt();
			
			System.out.println(power( x, n));
	
		}
	

}
