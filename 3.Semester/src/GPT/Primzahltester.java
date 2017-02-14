package GPT;

import java.util.Scanner;

public class Primzahltester {

	public static void main(String[] args){
				int n = 10;
				// beginne bei der Zahl 2 da 1 keine Primzahl ist
				for (int i = 2; i <= n; i++) {
					// isPrimzahl ist ein Wahrheitswert, um zu überprüfen ob wir eine
					// Primzahl gefunden haben. falls nicht wird sie später auf false
					// gesetzt.
					boolean isPrimzahl = true;
					// i durch jede Zahl kleiner als i zu teilen und zu überprüfen, ob
					// ein Rest übrig bleibt. BSP. im wiki 25=i und j wäre die Variable
					// die hochgezählt wird
					for (int j = 2; j < i && isPrimzahl; j++) {
						// Wenn eine division als rest 0 hat dann ist die Zahl keine
						// Primzahl und somit ist isPrimzahl auf false zu setzten
						if ((i % j) == 0) {
							isPrimzahl = false;
						}
					}
					// gib eine Meldung aus falls es sich um eine Primzahl handelt.
					if (isPrimzahl) {
						System.out.println(i + " ist eine Primzahl!");
					}
				}
	}
}
