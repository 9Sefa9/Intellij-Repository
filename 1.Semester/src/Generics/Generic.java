package Generics;

import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

import PanikRunde.spiel;

import java.util.*;

/*Informationen:
 * Collection: speichert eine Menge von Objekten und ietet Methoden zum Verwalten
 * Im gegensatz zu den Feldern,soll sie flexibler sein
 * Primitive Datentypen werden intern als Objekte entsprechender Wrapperklassen gespeichert 
 * z.b Integer, Float, Double....     nicht int.  double. float     also Wörtlich ganz aufgeschrieben!
 * 
 * 
 * AbstractList:::
 * add        Fügt am Ende der liste ein Element
 * remove	  entfernt ein element
 * get		  element mit dem index i
 * set		  ersetzt element mit index i
 * size       anzahl elemente in der liste 
 * iterator   liefert ein iterator für die liste (DEF: Ein Iterator ist ein Objekt, das es ermöglicht die Elemente eines Collection-Objekts nacheinander zu druchführen
 *
 *Linked List:
 *Vorteil: 		Die Einfüge und Löschoperationen sind im Prinzip , bei vielen elementen, performanter ! als bei array list. 
 *Nachteil: 	wahlfreie Zugriff ist langsamer als bei array list
 *Nutzung falls die Liste klein ist und wahlfrei darauf zugegriffen wird.
 *
 *Array List:
 *Vorteil: 		Speichert als Array von Elemeten, das bei bedarf vergrößert werden darf. Wahlfreie Zugriff schneller als Linked list ! 
 *Nachteil:		Bei großen Element-zahlen kann das Einfügen und löschen länger dauern als bei einer Linked List!
 *Nutzung falls die Liste sehr groß und häufig EInfügungen und Löschungen vorgenommen werden
 *
 *Vector:
 *Vorteil: 		Es ist eine Lineare List, kann ebliebig viele elemente haben, durchlaufen und zugriff auf elemente deutlich schnell
 *Nachteil:		Löschungen und Einfügungen sind langsamer
 *
 *size auf Inhaltlicher basis:  also z.b 1 element befindet sich in der Liste! ----> size()
 * allgemein starten Listen ab 0 !  also ist der index eines Objekts bei 0	   ----> size()-1
 */ 
		
 

public class Generic {

	public static void main(String[] args){

		ListenVonObjekten();

		
		// <GENERISCHEKLASSE><<TYPPARAMETER>> BEZEICHNER =new <GENERISCHEKLASSE><<TYPPARAMETER >>(<Parameter>);
				// Standardkonstruktor der ArrayList
				
				
				
		
	}
	public static void eineArrayList(){
		List eineListe = new ArrayList();
	
		eineListe.add(10);  // internet werdeN "Integer"-Objekte gespeichert
		eineListe.add(15);
		eineListe.add("Hallo");
		//einfache for schleife, der die alle elemente durchgeht und aufruf.
		for(int i=0; i<eineListe.size(); i++){
			System.out.println(eineListe.get(i));
		
		}
		// einfache for each schleife, danke des Iterators
		for(Object t : eineListe){
			System.out.println(t);
		}
		
   }public static void eineLinkedList(){
	   List linkedliste = new LinkedList();
	   
	   linkedliste.add(10);
	   linkedliste.add(15);
	   linkedliste.add("Hallo");
	   
	   for(int i=0; i<linkedliste.size(); i++){
		   System.out.println(linkedliste.get(i));
	   }
	   for(Object i:linkedliste){
		   System.out.println(i);
	   }
	   
   }
   public static void eineSummenAufgabe(){
	   List eineListe = new ArrayList();
	   eineListe.add(10);
	   eineListe.add(15);
	   eineListe.add("Hallo");
	   int sum = 0;	
	   int s;
	   for(int i=0; i<eineListe.size();++i){
		   sum+= (Integer)eineListe.get(i);		//Integer speicher string:     32 --->String
	   }
	   System.out.println("Summe: "+sum);
	   // GIbt am ende Error !!   String cannot be cast to Integer! Lösung siehe unten 
   }
	public static void KlassenMitTypvariablenUndObjekten(){
		ArrayList<String> eineIntegerListe = new ArrayList<String>();  // bei typparameter muss nicht nur variablen sein, sondern auch Objekte !
		String str = new String("Mein Name Ist Don Corleone");
		// hier wird eine liste aus meinem objekt "str" geaddet und erstellt!
		eineIntegerListe.add(str);  
		
		System.out.println("Länge: "+eineIntegerListe.size()); //size auf Inhaltlicher basis:  also 1 element befindet sich in der Liste!
		System.out.println("IndexOf: "+eineIntegerListe.indexOf(str)); // allgemein starten Listen ab 0 !  also ist der index eines Objekts bei 0
		
		
	}
	public static void ListenVonListenVonListen(){
		ArrayList<ArrayList<Integer>> liste2d = new ArrayList<ArrayList<Integer>>();   // Immer schön die Syntax beibehalten!
		liste2d.add(new ArrayList<Integer>());
		liste2d.get(0).add(2);
		System.out.println(liste2d.get(0).get(0));
	}
	// gültig :  public class test<x,,y>{
	//	}
	
	public static void ListeOhneTypparameter(){
		List liste = new LinkedList();
		liste.add(10); // intern werden "Integer" Objekte gespeichert
		liste.add(15);
		liste.add("Hallo");
		
		for(int i=0; i < liste.size(); i++) {// normaler Durchlauf
		System.out.println(liste.get(i));
		}
		for(Object i : liste) {// alternativer Durchlauf, dank des Iterators
		System.out.println(i);
		
//		ArrayList<Integer> tes = new List<Integer>();   ungültig !
//		List<Integer> tes2 = new ArrayList<Integer>();  gültig!
		
		}
	}
	public static void ListenVonObjekten(){
		ArrayList<Spiel> geil = new ArrayList<Spiel>();
		Spiel splintercell = new Spiel("Sam Fischer Ist Der Beste!");
		//splinter deklarisiert auf dem Objekten Spiel, erzeugung als referenzvariable auf den Konstruktor Spiel("..");
		
		geil.add(splintercell);	//speichert den inhalt von splinter auf geil
//		geil.add(new Spiel("ein Wunderbares spiel!"));
		 //Klassennamen@speicheradresse    wollen wir nicht haben!
	
		
		
		for(Spiel i : geil){
			System.out.println(i);
		}
		
		
		for(int i = geil.size()-1; i>=0; i--){
			System.out.print(geil.get(i));
		}
	
		
		}
	
		
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

