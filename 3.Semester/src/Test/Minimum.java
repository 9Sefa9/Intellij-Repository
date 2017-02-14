package Test;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] a) {
		Scanner eingabe = new Scanner(System.in);
		int i;
		int max = Integer.MIN_VALUE;
		while ((i = eingabe.nextInt()) != 0) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
