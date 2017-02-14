package Streams;

import java.util.*;
import java.io.*;
import java.net.URL;

public class URLAnalyzer {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.print("WIllkommen. Bitte schreiben sie den URL Hier rein :>>");
		String url = eingabe.nextLine();
		System.out.println(url);
		System.out.print("Bitte schreiben sie den Pfad wo sie es speichern möchten :>>");
		String pfad = eingabe.nextLine();
		System.out.println(pfad);
		System.out.println("Wie soll die Datei heißen ? ");
		String name = eingabe.nextLine();
		System.out.println("Kopiervorgang gestartet!");
		System.out.println("");
		System.out.println("");
		
		URLAnalyzer(url, pfad, name);

	}

	public static void URLAnalyzer(String URLinput, String outputpfad, String dateiname) {
		try { // falls eingabe leer dann starte von vorn.
			if (URLinput == null) {
				System.out.println("URLinput ist leer ! Bitte starte von Vorn!");
			} else { // ansonsten erstelle eine Datei über output und schreibe
						// den URL darein.
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputpfad + dateiname));
				bw.write("Folgende Seite wird analysiert: " + URLinput);
				System.out.println(
						"========================================================================================================");
				URL analysiereURL = new URL(URLinput);
				InputStream is = analysiereURL.openStream();	
				//An OutputStreamWriter is a bridge from character streams to byte streams:
				//An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				while (br.readLine()!= null) {
					System.out.println(br.readLine());
					
				}
			}

		} catch (IOException e) {
			System.out.println("Ich kann keine EIngabe feststellen !");
			e.printStackTrace();
		}
	}
}
