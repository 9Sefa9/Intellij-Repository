package GPT;

import java.util.Arrays;
import java.util.Collections;

public class Umdreher {
	public static void main(String[] args){
		String s =  "Name";
		System.out.println(umdrehenIterativ(s));
		System.out.println(umdrehenRekursiv(s));
		String st[] = {"Name"};
		printRec(st);
	}
	
	public static String umdrehenIterativ(String s){
		String ergebnis="";
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		return ergebnis;
	}
	public static String umdrehenRekursiv(String s){
		if(s.length() == 0)
			return "";
		else{
			String c = s.substring(s.length()-1, s.length());
			return c+=umdrehenRekursiv(s.substring(0,s.length()-1));
		}
			
	}
	public static <A> void printRec(A[] array)
	{
	    Collections.reverse(Arrays.asList(array));
	    Arrays.stream(array).forEach(System.out::println);
	}
}
