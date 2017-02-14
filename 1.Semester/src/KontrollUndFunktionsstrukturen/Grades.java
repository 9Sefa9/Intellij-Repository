package KontrollUndFunktionsstrukturen;

import java.util.Scanner;

public class Grades {

	/*
	 * "wandelt" Zahlen von 0-100 in in das amerikanische Notensystem um, wobei
	 * einmal eine if-Verzweigung bzw. ein switch-case verwendet wurde.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double score;

		do {

			System.out.println("Gib einen Wert zwischen 0 -100 ein. Um das Programm zu beenden bitte -1 eingeben");

			score = scan.nextDouble();
			// d am ende bedeutet dass es sich um ein Double wert handelt!
			// dasselbe git auch wenn man F hinschreibt
			if (score >= 0.0d && score <= 100.0d) {
				System.out.println("Die Note ist ");
				printGradeSwitch(score); // ruft die methode printGradeSwitch
											// auf!

			} else {
				System.out.println("Nicht im Wertebereich");
				continue;
			}
		} while (score != -1);

	}

	private static void printGradeIfElse(double score) {

		if (score >= 90.0d) {
			System.out.println("A");
		} else if (score >= 85.0d) {
			System.out.println("B");

		} else if (score >= 80.0d) {
			System.out.println("B-");
		} else if (score >= 75.0d) {
			System.out.println("C");
		} else if (score >= 70d) {
			System.out.println("C-");
		} else if (score >= 65.0d) {
			System.out.println("D");
		} else if (score >= 60.0d) {
			System.out.println("D-");
		} else {
			System.out.println("F");
		}

	}

	private static void printGradeSwitch(double score) {
		int scoreGanzzahlig = (int) score; // da 32 von einem double gespeichert
											// werden soll, muss (int) stehen
	
		// int char Strings sind erlaubt, ansonsten keine weitere Typen die bekannt sind.
		switch (scoreGanzzahlig/10 ) { 
		case 10:				
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");

			break;
		case 7:
			System.out.println("C");

			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("Fs");
		}
	}
}
