package ÜbungenLösungen;
public class AbsoluteSum {

	public static int sum(int current, java.util.Scanner scan) {
		/*
		 * Dies ist der ternaere Operator. Wenn die Bedingung, die vor dem
		 * Fragezeichen steht, erfuellt ist, gilt der Wert direkt nach dem
		 * Fragezeichen (und vor dem Doppelpunkt). Ist die Bedingung nicht
		 * erfuellt, dann wird der Wert nach dem Doppelpunkt genommen. Wenn also
		 * eine 42 ein- gegeben wurde, geben wir eine 0 zurueck, damit vorher-
		 * gehende Aufrufe nicht veraendert werden. Wenn dem nicht so ist, dann
		 * berechnen wir den Betrag von 'current' und addieren alle zukuenftigen
		 * Rueckgabewerte von 'sum'. Dabei lesen wir mit 'scan.nextInt()' die
		 * naechste Zahl ein.
		 */
		return current == 42 ? 0 : Math.abs(current)
				+ sum(scan.nextInt(), scan);
	}

	public static void main(String[] args) {
		// Lies eine Integer mittels 'Scanner' ein:
		java.util.Scanner scan = new java.util.Scanner(System.in);
		// Ruf die obige Methode auf und gib ihren Rueckgabewert aus:
		System.out.println(sum(0, scan));
	}

}
