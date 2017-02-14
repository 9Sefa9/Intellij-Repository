package ÜbungenLösungen;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String eingabe = scan.nextLine();
		printMostFrequent(eingabe);
	}

	public static void printMostFrequent(String str) {
		// dieses Array speichert die Anzahl der Vorkommen jedes Buchstaben
		int freq[] = new int[26];		

		// hier wird fuer jedes Auftreten eines Buchstaben der entsprechende
		// Wert im Array erhoeht
		// charAt(i) - 'a' sorgt dafuer, jeden Buchstaben auf einen Index
		// abzubilden: 'a'-'a' -> 0, 'b'-'a' -> 1 usw. bis 'z'-'a' -> 25
		
		for(int i=0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}

		// Index finden, hinter dem sich der groesste Wert im Array befindet
		
		int max = 0;
		for(int i=1; i < freq.length; i++) {
			if(freq[i] > freq[max]) max = i;
		}

		// max enthaelt den Index, 'a' + max ergibt den entsprechenden
		// Buchstaben und dieser wird ausgegeben
		System.out.println((char)('a' + max));
		// Anzahl ausgeben
		System.out.println(freq[max]);
	}

}
