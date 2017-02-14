package LernPaket;

import java.util.Scanner;
public class FibonnaciRekursiv {
/*4 Fibonacci-Folge (9 Punkte)
Die Fibonacci-Folge ist eine Zahlenfolge, bei der jedes Folgenglied aus der Summe der beiden
vorhergehenden Folgengliedern gebildet wird. Die ersten beiden Terme sind per Definition 0
und 1. Die ersten zehn Fibonacci-Zahlen sehen also so aus:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34 (1)
 * Schreiben Sie eine Klasse Fibonacci und speichern Sie diese als Fibonacci.java.
Ihr Programm bekommt einen nichtnegativen Integer n uber die Standardeingabe und muss ¨
die n-te Zahl (beginnend bei 0) der Fibonacci-Folge auf der Standardausgabe anzeigen (genau
eine Zahl). Beispiel: Fibonacci soll fur ¨ n = 4 den Wert 3 ausgeben. Sie sollen diese Aufgabe
mittels Rekursion l¨osen.
 */
	
	 
	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		int n = eingabe.nextInt();
		System.out.println("Fibonacci zahl:  "+fibonnaci(n));
		
	}
	public static int fibonnaci(int n){
		if(n == 0 || n == 1) 
			return n;
		
			return fibonnaci(n-2) + fibonnaci(n-1);
	
		
	}
}
