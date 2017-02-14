package PanikRunde;

import java.util.Scanner;

public class Multiplikationstabelle {

	public static void createTable(int a, int b) {

		for (int i = a; i <= b; i++) {
			System.out.print("\t" + i);
			// das erstellt die zeile MIT den jeweiligen zahlen bis b
			
		}
		System.out.println();
		for (int i = a; i < b; i++) {
			// erstellt eine spalte von oben nach unten von 1 bis b 
			System.out.print(i); // 
			for (int j = a; j <= b; j++)
				System.out.print("\t" + (i * j));
			System.out.println();

		}

	}

	public static void main(String[] args) {
		System.out.println("erste ziffer, mal die zweite ziffer");
		Scanner eingabe = new Scanner(System.in);
		int a = eingabe.nextInt();
		int b = eingabe.nextInt();
		createTable(a, b);
	}
}

