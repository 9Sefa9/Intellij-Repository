package PanikRunde;

import java.util.Scanner;

public class GrößterGemeinsamerTeiler {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("größter gemeinsamer teiler: " + ggt(eingabe.nextInt(), eingabe.nextInt()));
	}

	public static int ggt(int a, int b) {
		if (b == 0)
			return a;
		else
			return ggt(b, a % b);
	}

}
