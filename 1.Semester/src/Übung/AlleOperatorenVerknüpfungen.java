package Übung;

public class AlleOperatorenVerknüpfungen {

	public static String[] zeichenketteArray = { "Das", "ist", "schon", "wieder", "ein", "Test!" };
	public static String zeichenkette = "Mein Name ist Don Corleone";
	public static int[] ganzzahlArray = { 3, 6, 9, 2, 1 };
	public static int ganzzahl = 23;
	
	public static void main(String[] args) {

		System.out.println("\nSHALLOWCOPY 1:");
		ShallowCopy1();
		System.out.println("\nSHALLOWCOPY 2");
		ShallowCopy2();
		System.out.println("\nDEEPCOPY 1");
		DeepCopy1();
		System.out.println("\nDEEPCOPY 2");
		DeepCopy2();
		System.out.println("\nMATRIX 1");
		matrix();
		System.out.println("\nPOSITION UND LENGTHS");
		PositionUndLength();
		System.out.println("\nIsEmpty, IndexOf und Contains:");
		IsEmptyIndexOfContains();
		System.out.println("\n Integer to String converter und deepcopy");
		toStringMitCopy();
		
		
	}

	public static void ShallowCopy1() {
		char[] film = { 'i', 'n', 't', 'o', ' ', 'd', 'a', 'r', 'k', 'n', 'e', 's', 's' };
		char[] spiel = film;
		if (film == spiel) { // hier wurde zum erstenmal == benutzt statt
								// equals! überprüft den verweis, nicht den
								// inhalt!
			System.out.println("Die Felder sind gleich!");
		} else {
			System.out.println("Die Felder sind ungleich!");

		} // =====================================================================================
	}

	public static void ShallowCopy2() {
		char[] film = { 'i', 'n', 't', 'o', ' ', 'd', 'a', 'r', 'k', 'n', 'e', 's', 's' };
		char[] spiel = film;
		System.out.println("film[0]: " + film[0]);
		spiel[0] = 'I'; // Änderung durch spiel-Referenz
		System.out.println("film[0]: " + film[0]);
	}
	// ===========================================================================================
	public static void DeepCopy1() {
		char[] CharArray = { 'a', 'v', 'a', 't', 'a', 'r' };
		char[] KopiertCharArray = new char[CharArray.length]; // dieser array
																// hat soviee
																// array wie die
																// länge des
																// ersten char
																// Arrays!
		for (int i = 0; i < CharArray.length; ++i) {
			KopiertCharArray[i] = CharArray[i];
			System.out.println("KopierteCharArray!: " + i + "." + KopiertCharArray[i] + "");
		}
	}

	
	public static void DeepCopy2() {
		char[] Array = { 'D', 'O', 'N', 'C', 'O', 'R', 'L', 'E', 'O', 'N', 'E' };
		// char []KopiertArray = new char[Array.length];
		char[] KopiertArray = new char[Array.length]; //genau so vele elemente wie source array
		System.arraycopy(Array, 0, KopiertArray, 0, Array.length);
		for (char test : KopiertArray)
			System.out.println("Das ist systm array copy: " + test);

		/*
		 * 1.Select Source Array to start copying 
		 * 2.Start Position of Copying element. To COpy form the beginning = 0; 
		 * 3.Target Array, where you want to store your copied source element to where ? 
		 * 4.In Which Index you want to store the values from the source arrays target array 
		 * 5.How many elements you want to copy from the source array ? 
		 * natürlich die ganze länge!
		 */

	}
	public static void matrix(){
		double[][] mA = { {11.5, 2.1, 1.3},
				{ 3.1, 0.8, 2.2},
				{ 0.1, 4.1, 1.2},
				{14.8, 22.1, 3.1} };
		
		double[][] mB = new double[4][3];
				
				mB[0][0] = 11.5;
				mB[0][1] = 2.1;
				mB[0][2] = 1.3;
				mB[1][0] = 3.1;
				mB[1][1] = 0.8;
				mB[1][2] = 2.2;
				mB[2][0] = 0.1;
				mB[2][1] = 4.1;
				mB[2][2] = 1.2;
				mB[3][0] = 14.8;
				mB[3][1] = 22.1;
				mB[3][2] = 3.1;
				//wenn bedingung erfüllt
				for (int i = 0;i<4;++i) {
					//dann arbeitet der bis die bedingung vorbei ist.Siehe oben!
					for (int j = 0;j<3;++j) {
						
				System.out.println(mA[i][j] + " == " + mB[i][j]);
				}
				}
	}
	public static void PositionUndLength() {
		// fängt an bei 0 zu zählen! KEIN ARRAY
		char position = zeichenkette.charAt(2);
		System.out.println("CHAR POSITION = " + position);
		//fängt bei 1 an zu zählen ARRAY
		System.out.println("STRING ARRAY MIT LENGTH " + zeichenketteArray.length);// liefert
																					// die
																					// länge
																					// eines
																					// String
		//fängt bei 1 an zu zählen ARRAY											// arrays
		System.out.println("INT ARRAY MIT LENGTH " + ganzzahlArray.length);// liefert
																		// die
																		// länge
																		// eines
																		// int.
																		// arrays
		System.out.println("STRING MIT LENGTH"+zeichenkette.length());
		// WICHTIG: length --- arrays (int[], double[], String[]) ---- zur
		// Identifikation der länge
		// length() --- String related Object (String, StringBuilder etc) zur
		// Identifikation der länge eines Strings
	}

	public static void IsEmptyIndexOfContains(){
		System.out.println("S.ISEMPTY MIT ISEMPTY STRING".isEmpty());//liefert true, falls String leer ist.
		if(zeichenkette.isEmpty() || zeichenkette.contains("Hallo")){
			System.out.println("hat isEmpty und contains getestet!");
		}else System.out.println("TRIFFT EIN BEI ELSE! WEDER ISEMPTY NOCH CONTAINS");
		//fängt bei 0 an zu zählen! KEINE ARRAY!
		System.out.println("indexOf, durchsucht den String nach dem Buchstaben und gibt die Zahl aus! "+zeichenkette.indexOf('o'));
		
		System.out.println("DIES IST EIN SUBSTRING VON EINEM STRING!"+zeichenkette.substring(2, 5));//retunr the range form 2 to 5
		System.out.println("DAS IST CODE POINT AT"+zeichenkette.codePointAt(2)); // zählt ab 0 !
		System.out.println("Das ist Concate: Vit".concat("o")+" Corle".concat("one"));
		System.out.println("ERSETZT EIN BUCHSTABE MIT EINEM ANDERN!"+zeichenkette.replace('n','A')); // replaces every n with A  (attention to CamelCases)
		System.out.println("ÜBERPRÜFT OB DER ANGEGEBENEE MIT DEM CHAR ANFÄNGT(BOOLEAN) TRUE"+zeichenkette.startsWith("Mein"));
		System.out.println("ÜBERPRÜFT OB DER ANGEGEBEN MIT DEM CHAR ANFÄNGT (BOOLEAN FALSE"+zeichenkette.startsWith("Super"));
	}
	public static void toStringMitCopy(){
		String test = Integer.toString(ganzzahlArray[0]);
		System.out.println("wandelt Integer.toString zu einem String!"+test);
		String [] test2 = new String[zeichenketteArray.length];
	
		System.arraycopy(zeichenketteArray, 0, test2, 0, zeichenketteArray.length);
		for(String i:test2){
			System.out.println("das ist test2 kopiert von zeichenkettteArray: "+i);
		}
		
		
	}

}
