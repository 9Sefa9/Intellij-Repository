package Präsenzaufgaben_Lösungen.Strings_Arrays;
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hallo";
		methodeEins(s1);
		String s2="Hallo";
		//System.out.println(methodeZwei(s1,s2));
		
		
		String s3 = "Riesenrennregenwurmringelwirrwarr";
		System.out.println(methodeDrei(s3));
		methodeVier(s3);
	}
	
	// gibt die Zeichen eines Strings untereinander aus
	public static void methodeEins(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		
	}

	// prüft ob zwei Strings gleich sind.
	public static boolean methodeZwei(String s1, String s2) {
		return s1.equals(s2);
	}
	
	
	// ersetzt jedes vorkommen des Buchstaben r/R in einem String mit l/L mithilfe der replace-Methode
	public static String methodeDrei( String text ) {
		    text = text.replace( 'r', 'l' );
		    text = text.replace( 'R', 'L' );

		    return text;
		  }

	// ersetzt jedes vorkommen des Buchstaben r/R in einem String mit l/L
	public static void methodeVier( String text ) {
		    for ( int i = 0; i < text.length(); i++ ) {
		      char c = text.charAt( i );

		      if ( c == 'r' )
		        c = 'l';
		      else if ( c == 'R' )
		        c = 'L';

		      System.out.print( c );
		    }
		    System.out.println();
		  }
	


}
