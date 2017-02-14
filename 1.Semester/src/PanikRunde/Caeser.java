package PanikRunde;

import java.io.*;

public class Caeser {

	// ergänzungs aufgabe
	// 1. Exception m = new Exception
	// 2. (rechtsOben) catch(exception e){kann leer sein}
	// 3. (unten links) throws IO exception
	// 4. try(bufferedReader br = new bufferedReader(new FileReader(filename))
	// ______________________________________________________________________________________________________
	public static void main(String[] args) {
		encrypt("C:/Users/Sefa/Desktop/eingabeText.txt", "C:/Users/Sefa/Desktop/AusgabeText.txt");
	}

	// eine bequemer reader: effizient ganze zeilen oder ganze strings lesen
	public static void encrypt(String inputpath, String outputpath) {
		try (BufferedReader br = new BufferedReader(new FileReader(inputpath));
				FileWriter fw = new FileWriter(outputpath)) {
			
			String line = "";
			while ((line = br.readLine()) != null) {
				String output = "";
				
				//Das eigentliche  Programm
				for (char c : line.toCharArray()) {
					
					if ('A'<c&& c <= 'Z') {
						
						// speicher es in dem output ab, wobei der char +3
						// eingetragen wird

						output += (char) (((c + 3 - 'a') % ('z' - 'a')) + 'a');
					} // z-a % z-a ist gleich rest 0
					else {
						output += c;

					}
				}
				fw.write(output);
			}
		}

		catch (IOException e) {
			System.out.println(e);
		}
	}
}
