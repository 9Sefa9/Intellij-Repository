package Streams;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner; // normale bekannte Eingabe

public class Streams {

	public static void main(String[] args) throws IOException  {
		
		DerBufferedFileReader();
			
	  /*
	   * Use FileWriter class if you want to read a text file in platform's default character encoding, 
	   * otherwise use OutputStreamWriter to provide custom character encoding. 
	   * Also use FileOutputStream if you want to write bytes to file in Java.
	   */
																	
	}

	/*
	 * Random Interfaces, unabhängig der streams:
	 * AutoCloseable, Appendable, Flushable, Serializeable
	 */
	/*
	 * =========================================================================
	 * Nachfolgend siehst du eine kleine Liste mit den Methoden Write-Read-File
	 * File:
	 * .createNewFile(); .mkdirs(); .isFile() .isDirectory
	 * 
	 * FileWriter:
	 * .write(); .close(); .flush(); 
	 * 
	 * BufferedWriter:
	 * .write();  .newLine(). .close(); .flush();
	 * 
	 * FileReader:
	 * .read(ein Integer);
	 * 
	 * BufferedReader:
	 * .read(ein Integer); .readLine(String); .close();
	 * 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 * 
	 * InputStream:
	 * Abstrakte InputStream Klasse --> kann kein objekt davon erzeugt werden !
	 * 
	 * Die Leser-Input-Streams Familie:::
	 * InputStream 				zum lesen aus Dateien
	 * ObjectInputStream 		liest primitive Daten und vorher serialisierte Objekte
	 * BufferedInputStream 		gepufferte inputstream 
	 * DataInputStream 			liest primitive Datentypen
	 * FilterInputStream  	enthät Inputstream, wird zum verketten/filtern benutzt  
	 * FileInputStream			obtains bytes from filename 
	 * 
	 * Die schreibe-Output-Streams Familie:::
	 * Abstrakte OutputStream Klasse --> kann kein objekt davon erzeugt werden!
	 * 
	 * Outputstream: abstrakte Outputstream Klasse,
	 * FileOutputStream: Outputstream zum Schreiben in Dateien
     * ObjectOutputStream: schreibt primitive Daten und serialisiert Objekte,
     * BufferedOutputStream: gepufferter Outputstream
     * DataOutoutStream: schreibt primitive Datentypen,
     * FilterOutputStream: enthält Outputstreams, dient verketten/filtern
     * 
//	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
	 * 
	 * Die Reader Klassen:::
	 * InputStreamReader		Bridge from byte streams to character verwende: BufferedReader bsr = new BufferedReader(new InputStreamReader(new FileInputStream("DieZuLesendeTextDatei.txt"))); 
	 * PrintReader				Existiert nicht ! verwende : BufferedReader br = new BufferedReader(new FileReader("Pfad oder DateiName"));
	 * FileReader				allgemeine Klasse zum lesen aus Textdateien
	 * BufferedReader			kann zweilenweise eingaben lesen
	 * 
	 * 
	 * Die Writer Klasse
	 * BufferedWriter			schreibt character/strings in einen Stream & unterstützt Zeilenumbrüche(newLine)
	 * FileWriter				allgemeine Klasse zum schrieben in Textdateien 
	 * PrintWriter 				Ausgabemethode für alle primitiven Datentypen und für Objekttypen in textueller form!
	 * OutputStreamWriter		Brücke von character streams zu den byte streams(provides custom character encoding)
	 */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	//CHECK ANLADIM
	public static void DerBufferedFileWriter() {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Sefa/Desktop/DerBufferWriter.txt"))) { // nur mit einem
															
	
			bw.write("Anne seni cok seviyorum!"); 
			bw.newLine();	// nur der bufferwriter kann newLine() aufrufen !  optional
			bw.write("hemde Cok !!");

		} catch (IOException e) {
			System.out.println("Die datei test.txt wurde breits erstellt!");
			e.printStackTrace();
			// catch{...... nicht mehr als eine exception)}
			// emhrere Cathes möglich, aber nur eine Try anweisung
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void DerBufferedFileReader() {
		// liest alle zeilen in der Datei test.txt
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"));	
//				 das was wir schrieben wird in die konsole ausgegeben,(system.in)
//				we create an InputStreamReader which reads bytes from System.in
//				So, in the end, you have a BufferedReader that reads from an InputStreamReader that reads from System.in.


				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) { 			
           String s;
			while ((s = br.readLine()) != null) { // am besten so aufschreiben
													// und nicht String s =
													// br.readline.
				System.out.println(s); // denn sonst gilt es nur für die erste
										// zeile, aber wir wollen mehrere
			}
		} catch (IOException e) {
			System.out.println("test.txt konnte nicht gelesen werden, weil sie nciht erstellt wurde!");
			e.printStackTrace();
		}
	}

	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	public static void DieFileMethode() {
	//	Ohne Try-resource
		File f;
		try {
			f = new File("C:/Users/Sefa/Desktop/DieFileMethode.txt"); //pfad angabe+dateiname und format!
			f.mkdir();// erstelle Ordner
			f.createNewFile();// erstelle neue Datei
			if (f.isDirectory() == true) {
				System.out.println(true);
			} else { 
				f.delete();
				f.mkdir();
			
			}
		} catch (IOException s) {
			System.out.println("fehler! irgendwas ist schief gelaufen!");
			s.printStackTrace();
		}
	}

	
	
	
// ===============================================================================================================================================
	
	
	
	
	
	public static void DerBufferedPrintWriterBruch() {
		// PrintWriter: Ausgabemethode für alle primitiven Datentypen und für Objekttypen in textueller form!
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/Sefa/Desktop/hallo.txt")));) {
			pw.println("WIllkommen beim Bruchrechnen!"); // printF verwendet
															// die
															// Methode printf
															// zur
															// Ausgabe von
															// String,
															// Ganz,Fließkommazahln+Zeilenschaltung
			int grenze;
			double zaehler;
			double nenner;
			
			
			Scanner eingabe = new Scanner(System.in);
			System.out.println("Zähler: ");
			zaehler = eingabe.nextDouble();
			System.out.println("Nenner: ");
			nenner = eingabe.nextDouble();
			System.out.println("Bis zur wie vielten zahl soll gerechnet werden ?");
			grenze = eingabe.nextInt();

			if (nenner != 0) {
				for (; nenner < 1000; nenner *= 2.0) {
					double bruchrechnen = zaehler / nenner;

					pw.println("Bruchrechnung: " + zaehler + "/" + nenner+"\t"+"Summe: " + bruchrechnen+"\n");
					pw.println("");
					

				}

			}
			
			pw.println("Die rechnung war erfolgreich!");
		} catch (IOException e) {
			System.out.println("Fehler!");
			e.printStackTrace();
		} 

		}
	public static void FielReaderchen(){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void DerFileInputStream() {
		// Dateiname wird übergeben
		
		try {
			
			FileInputStream fis = new FileInputStream("irgendwas.txt"); // obtains
																	// bytes
																	// from
																	// filename
																	// --> for
																	// chars:
																	// use
																	// FileReader!
			InputStreamReader isr = new InputStreamReader(fis); // InputStreamReader
																// is a bridge
																// from byte
																// streams to
																// character
																// streams: It
																// reads bytes
																// and decodes
																// them into
																// characters
			
			BufferedReader bur = new BufferedReader(isr); //Reads text from a character-input 
														  //stream, buffering characters so as to provide for the efficient reading of characters, 
														  //arrays, and lines. 		
			
			
			// die erste Zeile wird eingelesen
			String sLine = bur.readLine(); 
			// wichtig: 
			//readLine : String
			//read	   : int (allerdings nur einzelne zeichen weshalb wir dann auf sowas greifen müssen:
			/*while((int i = br.read() !=-1){
			 * System.out.priNT( caste integer zu einem char = 32-->16 = (char)s);
			 * catch.... oder bei try resource weglassen!
			 */
			

			// lies alle Zeilen aus, bis keine mehr vorhanden sind
			// und gib sie nacheinander aus
			
			int zaehler = 0;
			while (sLine != null) { // 
				System.out.println("Zeile " + zaehler + ": " + sLine);
				sLine = bur.readLine();
				zaehler++;
			
			}
			// schließe die Datei
			bur.close();
		} catch (IOException IO) {
			System.out.println("Folgender Fehler trat auf: " + IO);
			IO.printStackTrace();
		}
	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	public static void DerBufferedInputStream(){
		
		int s;	// ähnlich zu buffered/file -Reader
		//BEIDE arbeiten identisch.  Sie sehen nur anders aus! 
		try(BufferedInputStream brs = new BufferedInputStream(new FileInputStream("DieZuLesendeTextDatei.txt"));
			BufferedReader bis = new BufferedReader(new InputStreamReader(new FileInputStream("DieZuLesendeTextDatei.txt"))); ){ 
			
			while ((s = bis.read()) != -1){
				System.out.print((char) s);
			}
		}catch ( IOException e){
			System.out.println("Fehler! Datei nit gefunden");
			e.printStackTrace();
		}
		
	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void toLowerUndUpCases() {
		String werdeIch = "IcH,HeIße,DoNCoOrlEonE";
		String kleingeschrieben = werdeIch.toLowerCase();
		
		System.out.println("Vorher:" + werdeIch);
		System.out.println("Nachher: " + kleingeschrieben);

		char[] c = werdeIch.toCharArray();
			String s = "" + c[0]; // char ist ein primitiver datentyp ! und String
			// referenzdatentyp ! also einfach so machn.
			System.out.println("Ein Char Array wurde erstellt " + c[0]); // muss so
																		// geamcht
																		// werden
																		// oder
																		// gleich
																		// mit
																		// for
																		// each
																		// schleife!
			System.out.println("ein char Array wurde zu einem String: " + s.toString());
			
			String str = "3";
			int test = Integer.parseInt(str);
			System.out.println("Es wurde ein String zu Integer.parseInt('3') konvertiert!");
			
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void SuperGeileZusammenfassung() {
		
		try{
		BufferedWriter bw = new BufferedWriter(new FileWriter("irgendEinPathZumWriten.txt"));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.")));
		
		
		BufferedReader t1= new BufferedReader(new InputStreamReader(System.in));					//Ausgabe auf der konsole per readLine();
		BufferedReader t = new BufferedReader(new FileReader("DieBereitsVorhandeneTextDateiLesen.txt")); 
		BufferedReader t2= new BufferedReader(new InputStreamReader(new FileInputStream("DieBereitsVorhandeneTextDateiLesen.txt"), StandardCharsets.UTF_8));
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("pfad"));				//byte orientiert
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("pfad"));			//byte orientiert
		
	
		FileReader fr = new FileReader("DieZuLesendeTextDatei.txt");
		File 			f	= new File("Pfad");
		FileInputStream fis = new FileInputStream("IrgendEinPathZumReaden.txt");					//byte orientiert
		FileWriter fw = new FileWriter(f, false); 													//datein nach hinten anhängen an, oder aus
		
	
		
		
		}catch(IOException e){
			System.out.println("problem");
		}
	}
	public static void test() throws IOException{
//		Kopiert das innere des InputTextes und schreibt eine neue datei mit dem Input Inhalt. Am Ende entsteht output , im inhalt aus input
		FileWriter fw = new FileWriter("OutputTextDatei.txt");
		FileReader fr = new FileReader("InputTextDatei.txt");
		File       f  = new File("InputTextDatei.txt");
		char[] test = new char[(int) ((int)f.length())]; 	// erstelle so viele char elemente wie die länge des Files test.txt(inhaltlich)
		//length ist ein long, deshalb muss sie gecastet werden !
		
		fr.read(test);
		fw.write(test);
		fr.close();
		fw.close();
	}

}
