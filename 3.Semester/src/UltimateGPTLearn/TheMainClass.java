package UltimateGPTLearn;

import java.lang.Exception;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/*Diese Klasse beinhaltet alle informationen, die man braucht, um die Klausur GPT zu bestehen
 * es werden ausschließlich im bereich der Objekt-Orientierung programmiert. Suche im google
 * nach visuellen beispielen über UML, Interfaces und abstrakte Klassen. */
//primitive/referenz-Datentypen
//Überladen/Überschreiben von Methoden, Konstruktoren
//Rekursion/Iteration
//Streams & Generics 
//Unchecked/checked  Exceptions 
//try-Catch-throw bzw. try-resource und finally  
//Interface/abstrakte Klassen
//schleifen/Bedingungen
//Arrays und wichtige Methoden
//super-funktion

public class TheMainClass implements TheInterface {

	// primitive Datentypen
	public int i32;
	public float f32;
	public long l64;
	public double d64;
	public short s16;
	public byte b8;
	public boolean b = true;

	// Referenz Datentypen
	private String s = "Das ist ein String";
	private int[] iArray = {3,1,2,1,3};
	public char c = 'C';
	
	public TheMainClass(String s){
		
	}
	public TheMainClass(int i){
		
	}
	public static void main(String[] args) {

	}

	public int interfaceMethod(int zahl1, int zahl2) {
		return zahl1+zahl2;
	}

	public int[] interfaceMethodArray() {
		return this.iArray;
	}

	public int abstractMethod() {

		return 0;
	}

}
