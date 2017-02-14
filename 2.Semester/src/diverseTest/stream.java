package diverseTest;
import java.util.Scanner;
import java.io.*;
//öffnet einen jpg als eine textdatei. 
public class stream implements AutoCloseable{
	public static void main(String[] args) {
		String pfad;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("\tJPG-Viewer V1.0");
		System.out.print("JPG Datei im Pfad :> ");
		pfad = eingabe.nextLine();
		listDirectory(pfad);
		//lookUpThis(pfad);
	}
	
	public static void listDirectory(String pfad){
		File f = 
			}
		
	public static void lookUpThis(String pfad){
		try(BufferedReader br = new BufferedReader(new FileReader(pfad))){
			System.out.println("\n========================================STARTE SEQUENZ========================================\n");
			
			String wort = "";
			while((wort=br.readLine()) != null){
				System.out.println(wort);
			}
				
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
