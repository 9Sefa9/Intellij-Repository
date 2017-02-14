package Streams;

import java.io.*;
import java.util.*;

/*In dieser AUfgabe sollen sie ein einfaches Prüfsummenverfahren implementieren 
 * welches alle Zeichen in 
 * einer Datei in einer einzigen int-Variablen aufsummiert.
 * Implementieren sie dazu eine Methode checksum, die zum folgendem Code passt.
 * 
 */
public class ProbeKlasurStreams {

	
	public static void main(String[] args){
		if(args.length != 2){
			System.err.println("Diese Programm braucht genau 2 Dateinamen als Argumente!");
			
		}
		try{			//pfad   1 2 3 4 = 10
			int s0 = checksum(args[0]);
			int s1 = checksum(args[1]); //pfad	// 1234 = 10 
			if(s0 != s1)
				System.out.println("Die Datei unterscheiden sich in der CHecksumme("+s0+"!="+s1+")");
			else
				System.out.println("Der inhalt der Datein ist vermutlich identisch!");
			
		}catch(IOException r){
			System.out.println("Irgendwas ist beim Dateizugriff schief gelaufen");
		}
	}
	public static int checksum(String a) throws IOException{
		int sum=0;
						// wobei a der Pfad
		FileReader fr = new FileReader(a);
		int s=0;	
		int i;
			while( (i=fr.read() ) != -1){
				System.out.println(i+=s);
			
			  
			}
			return sum;
			
		
	}
}
