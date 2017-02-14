package ÜbungenLösungen;
import java.util.Scanner;
public class Primzahl2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Bitte Zahl eingeben!:> ");
		int zahl = eingabe.nextInt();
		System.out.println("die Zahl ist:  "+primzahlermittlung(zahl));
	}
	public static boolean primzahlermittlung(int x){
		boolean istEinPrimzahl =true;
		
		for(int i=2; i<x; ++i){
			if((x%i)==0){
				istEinPrimzahl = false ;
				
			}else if(istEinPrimzahl)
				istEinPrimzahl = true;
			
			}
		
		return istEinPrimzahl;
	}

}
