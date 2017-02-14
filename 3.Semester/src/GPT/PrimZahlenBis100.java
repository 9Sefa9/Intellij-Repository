package GPT;

import java.util.Scanner;

public class PrimZahlenBis100 {

	public static void main(String[] args) {
		
		int max = 100;
		for (int i = 1; i < max; i++) {
			boolean isPrimeNumber = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				System.out.print(i + " ");
			}

		}

	}

}
