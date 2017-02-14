package PanikRunde;

import java.io.*;

public class CaeserIstTot {

	public static void main(String[] args) {

		encrypt("C:/Users/Sefa/Desktop/eingabeText.txt", "C:/Users/Sefa/Desktop/AusgabeText.txt");
	} // try resource braucht genau so eine gescheifte Klammer wie bei einem
		// normal try und catch

	public static void encrypt(String input, String output) {
		try (BufferedReader br = new BufferedReader(new FileReader(input));
				FileWriter fw = new FileWriter(output); // der konstruktor ist
														// eine rückgabemethode
														// die einen wert
														// zurückgibt
				BufferedWriter bw = new BufferedWriter(new FileWriter(output));) {
			String str = br.readLine();
			while (str != null) {
				String ausgang = "";
				System.out.println(str); // 7 gitb immer nur die erste zeile
											// aus. // man bekommt immer die
											// nächste zeile damit
				for (char c : str.toCharArray()) {

					if ((c < 'Z' && c > 'A') || (c < 'z' && c > 'a')) {
//int vom char zu bekommen 
						ausgang += (char)((((c + 3) - 'a') % ('z' - 'a')) + 'a');
					} 
					else {
						ausgang += c;
					}
				}

				fw.write(ausgang);
			str = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Fehler!!");
			e.printStackTrace();

		}
	}
}
