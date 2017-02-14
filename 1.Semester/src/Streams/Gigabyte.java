
package Streams;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Gigabyte {

	public static String pfadEingang;
	
	public static void main(String[] a){
		
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Bitte pfad eingeben!:> ");
		pfadEingang = eingabe.nextLine();
		
		verdoppeln(pfadEingang);
	}
	public static void verdoppeln(String pfad){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pfad));
			BufferedReader br = new BufferedReader(new FileReader(pfad))){
			String leer = "";
			while(true){
				bw.write("hahaha");
			}
	
//			bw.write("EinName");
//			while((leer = br.readLine()) == null){
//				bw.write("EinName");
//			}
			
		}catch(IOException fehler){
			System.out.println("Fehler!");
			fehler.printStackTrace();
		}
		
		
		
	}
}
