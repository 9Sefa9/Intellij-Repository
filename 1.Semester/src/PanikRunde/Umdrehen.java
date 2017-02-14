package PanikRunde;

import java.util.Scanner;

public class Umdrehen {
	public static String klein (String e){
		String a = "";
		for(int i=0; i<e.length();++i){
			if(e.charAt(i)>='A' && e.charAt(i)<='Z'){
				a = a+(char)(e.charAt(i)+32);
				
			}
			else a=a+e.charAt(i);
		}
		return a;
	}
	public static void main(String[] args){
		System.out.println(klein("HALLO"));
	}
}
