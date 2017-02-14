package GPT;

import java.util.Scanner;

public class Multiplikationstabelle {

	public static void main(String[] s) {
		
		int zahl1 = 2;
		int zahl2 = 6;

		System.out.println("");
		System.out.println("\t");
		//kopfzeile
		for(int i = zahl1; zahl1<=zahl2; i++){
			System.out.print(i+"\t");
		}
		
		//tabelle
		for(int j = zahl1; j<=zahl2; j++){
			System.out.print(j+"\t");
			for(int k = zahl1; zahl1<=zahl2; k++){
				System.out.print(j*k+"\t");
			}
			System.out.println();
		}
	}
}
