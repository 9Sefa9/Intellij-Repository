package ÜbungenLösungen;
public class SumRecursion {

	public static int sum(int current, java.util.Scanner scan) {
		// mit jedem Aufruf wird eine neue Zahl eingelesen
		int x = scan.nextInt();
		
		// Abbruchbedingung: eingegebene Zahl ist 0
		if(x == 0) return x;
		// x != 0: addiere x zum Ergebnis vom naechsten Aufruf von sum()
		else return x + sum(current, scan);
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println(sum(0, scan));
	}
}
