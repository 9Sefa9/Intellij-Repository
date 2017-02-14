package GPT;

import java.util.Scanner;
//funktioniert einfach nicht
public class Binomialkoeffizient {

	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		int n = 0;
		int k = 0;
		
		System.out.println("Binomialkoeffizientrechner v1.0");
		System.out.print("n =  ");
		n = eingabe.nextInt();
		
		System.out.print("k =  ");
		k =eingabe.nextInt();
		
		System.out.println(rechnebinomialvon(n,k,n-k));
		
	}

	public static int rechnebinomialvon(int n, int k, int s) {
			if(n == 0 || k == 0|| s <= 0)
			return 1;
			else{
				

			 return  k*rechnebinomialvon(n, k-1,s);
				
			
			}
	}
}