import java.util.*;
import java.io.*;

public class TextKopierer {

	private static String inhaltEingang;
	
	public static void main(String[] args) {
		
		derScanner();

	}
	public static void derScanner(){
		String pfadEingang;
		String pfadAusgang;
		String entscheidung;
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Willkommen. Bitte geben sie den Pfad ein wo die Text Datei ist:> ");
		
		pfadEingang = eingabe.nextLine();
		
		System.out.print("Die Text Datei beinhaltet folgende Text:> ");
		textInhalt(pfadEingang);
		
		System.out.println("Möchten sie sie woanders Kopieren ? Ja oder Nein ? ");
		entscheidung = eingabe.nextLine();
		
		switch(entscheidung){
		case "Ja": System.out.println("wohin möchten sie Kopieren bitte unbdingt dazu den Namen des zu neu erstellten Dateis angeben!?");
				   pfadAusgang = eingabe.nextLine();
				   System.out.println("Kopier vorgang läuft...");
				   kopierer(pfadAusgang,pfadEingang);
				   System.out.println("Kopiervorgang abgeschloßen!");
				   break;
		case "Nein": System.out.println("Programm wurde beendet");
		}
		
	}
	
	public static String textInhalt(String input) {
		
		// durchforced eine Text Datei (read) und gibt sie dementsprechend aus (siehe unten return)
		String inhalt = "";
		try(BufferedReader br = new BufferedReader(new FileReader(input))){	
			
			while((inhalt=br.readLine()) != null){
				System.out.println(inhalt);			
			}	
			//speichert auf die Instnzvariable
			
		}
		catch(Exception e){
			System.out.println("Text datei wurde leider nicht gefunden! versuch es nochmal!..");
			derScanner();
		}
		return "Und das ist der Codierte Form:"+inhalt;
		
	}
	public static void kopierer(String pfadAusgang, String pfadEingang){
		//Hier soll der Kopierte Inhalt woanders hin gespeichert werden. (eine eventuelle for schleife erstellt haufenweise TextDateien xD
		String inhalt = "";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pfadAusgang)));
			BufferedReader br = new BufferedReader(new FileReader(pfadEingang))){
		
	    while((inhalt=br.readLine()) != null){
	    bw.write(inhalt);
	    }

		}catch(IOException io){
			System.out.println("Fehler! pfadAusgang/Eingang nicht gefunden/fehlerhaft/oder sonstiges!");
			io.printStackTrace();
		}finally{
			
		}
	}
	
	

}

