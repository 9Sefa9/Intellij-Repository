package ÜbungenLösungen;
public class Sortieren {

	public static void main(String[] args) {

		/*
		 * Um von der Konsole einlesen zu koennen, benoetigen wir zunaechst
		 * einen Scanner, der von der Standardeingabe lesen kann.
		 */

		java.util.Scanner sc = new java.util.Scanner(System.in);

		/*
		 * Wir lesen nun drei Integer ein, die wir dann sortieren.
		 */

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		/*
		 * Es gibt 3! = 3*2*1 = 6 Moeglichkeiten, die drei Zahlen anzuordnen.
		 * Eine davon muss also die richtige Loesung fuer unser Problem sein, egal
		 * wie die Zahlen lauten. Um systematisch vorzugehen, vergleichen wir
		 * zunaechst a mit b, dann b mit c und zum Schluss (wenn noetig) c mit a.
		 * Je nachdem, ob diese Aussagen wahr oder falsch sind, wird eine
		 * entsprechende Ausgabe gemacht. Bei den Ausgaben sorgt der String "\n"
		 * fuer einen Zeilenumbruch. Strings werden mittels '+' konkateniert.
		 */

		if (a > b) {
			if (b > c) {
				System.out.println(a + "\n" + b + "\n" + c);
			} else {
				if (c > a) {
					System.out.println(c + "\n" + a + "\n" + b);
				} else {
					System.out.println(a + "\n" + c + "\n" + b);
				}
			}
		} else {
			if (b > c) {
				if (c > a) {
					System.out.println(b + "\n" + c + "\n" + a);
				} else {
					System.out.println(b + "\n" + a + "\n" + c);
				}
			} else {
				System.out.println(c + "\n" + b + "\n" + a);
			}
		}

	}

}