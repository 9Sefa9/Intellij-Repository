package Übung;

public class Strinrg {
	private static boolean w = false;

	public static void main(String[] args) {
		Strinrg test = new Strinrg();
		System.out.println(test.test(w));
	}

	public boolean test(boolean k) {
		try {
									//zwei elemente 0 und 1
			String[] es = new String[2];
			es[0] = "Hello";
			es[1] = "World";
			
			w = true;
			System.out.println("" + es[0] + es[1]+" " + w);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array wurde übershritten!");
			e.printStackTrace();
			w = false;
			return false;

		}
		return w;
	}

}
