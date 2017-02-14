package LernPaket;

public class ArrayListAusDemKopf<Datentyp> {
	private Datentyp[] s;
	int N = 0;

	public ArrayListAusDemKopf(int kapazitaet) {
		s = (Datentyp[]) new Object[kapazitaet];
	}

	public boolean isEmpty() {
		return N == 0;
	}// schwierigkeiten irgendwie diese Methode zu l�sen
		// wir arbeiten ftmals mit N. inkrementiert wird in dem Array drinne!

	public void push(Datentyp datentyp) {

		if (N == s.length) {
			resize(s.length*2);
		} else {
			s[N++] = datentyp;
		}
	}

	public void resize(int N) {
		Datentyp copy[] = (Datentyp[]) new Object[N];
		for (int i = 0; i < N; i++) {
			copy[i] = s[i];
		}
		s = copy;
	}// heir wichtig, dass der zur�ckgelegte wert = NULL sein muss !

	public Datentyp pop() {
		Datentyp item = s[--N];
		s[N] = null;
		// bedingung aus dem kopf war richtig ! allerdings muss der N gr��er
		// Null sein ! weil was passiert, wenn sich
		// das element im 0 breich befinent ? ArrayIndexOutOfBoundsException
		if (N == s.length / 4 && N>0) {
			resize(s.length/ 2);
		} 
		return item;
	}
	public static void main(String[] args) {

		ArrayListAusDemKopf<String> array = new ArrayListAusDemKopf<>(9);
		array.push("Mein");
		array.push("Name");
		array.push("Ist");
		array.push("Sefa");

		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
	}
}
