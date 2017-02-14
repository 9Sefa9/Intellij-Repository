package ‹bung;

public class length‹bung {
	public static int[] in = { 5, 6, 7, 8 };
	public static String[] str = {"Hallo", "das", "bin", "ich!"};
	public static void main(String[] args) {
		System.out.println("erstmal kommt integer aufruf: ");
		IntegerArrayAufruf(); // ausgabe 5, da s[0]=5
		System.out.println("Jetzt Strig aufruf!");
		StringArrayAufruf();
	}

	public static void IntegerArrayAufruf() {
		System.out.println("i[0] = "+in[0]);
		System.out.println("i.length-1 = "+(in.length-1)); // es ist das letzte ELEMENT! nicht INHALT!!!
		System.out.println("das ist int length = "+in.length);
	
		for (int i = 0; i < in.length; ++i) {
			System.out.println("Das ist die for schleife s[i] = "+in[i]);// geht den inhalt des Arrays durch!
			
		}
	}
	public static void StringArrayAufruf(){
		System.out.println("das ist stirng.length() = "+(str.length)); //anzahl der Strings in dem Array(inhaltlich)
		System.out.println("Das ist String length-1 = "+(str.length-1));// anzahl der Elemente in dem String(elementalich)
	}

}
		

		
		
		
		
		
		
		
		
		
		
		/*			int [] oldArray = {1, 5, 6, 10, 25, 17};

			for(int i = 0; i < oldArray.length; i++){
			
			ƒQUIVALENZ ZU:

			int [] oldArray = {1, 5, 6, 10, 25, 17};

			for(int i = 0; i <= oldArray.length - 1; i++){
			So basically, you want to use oldArray.length - 1 when you need to access the last element.
		 *  
		 * 
		 */
	

