package Generics;

import java.util.*;
import java.io.*;
import java.lang.AutoCloseable;
public class Kopierer{

	public static void main(String[] args){
		// WICHTIG::     CLOSE NCIHT VERGESSEN SONST ENTSTEHEN BLANKE DATEIEN !
		
KopierProgramm();
	
	}


	
	public static void KopierProgramm(){
		try{	//erstelle originaldatei
			File f = new File("OriginalDatei.txt");
			f.createNewFile();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			String t = "ich schreibe jetzt in die OriganlDatei!";
			bw.write(t);
			BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()));
			String str;
			while((str = br.readLine()) != null){
				//liest den inhalt, was in DIE Datei eingetragen wurde xD
				System.out.println("folgendes wird gleich kopiert: "+str);
			}	//wenn es eine datei ist, dann
			if(f.isFile()){
				//mach ne neue datei
				FileWriter fw = new FileWriter("KopieVonOriginal.txt");
				fw.write(t);
				//close es, a wir es nicht mehr verwenden
				fw.close();	
				//ansonsten fehler!
			}else System.out.println("fehler!");
			br.close();
			bw.close();
			
			System.out.println("Vorgang erfolgreich beendet!");
			
		}catch(IOException e){
			System.out.println("Fehler!");
			e.printStackTrace();
		}
	}
	
}

