package ÜbungenLösungen;
public class Pruefsumme {

	public static void main(String[] args) {
		String s1 = "Hallo";
		String s2 = "Ballo";
		if (pruefsumme(s1) == pruefsumme(s2))
			System.out.println("PrÃ¼fsumme gleich");
		else
			System.out.println("PrÃ¼fsumme verschieden");

	}

	public static int pruefsumme(String s) {

		int summe = 0;
		for (int i = 0; i < s.length(); i++) {
			summe += s.charAt(i);
		}
		return summe;
	}

}
