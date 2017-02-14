package Streams;
import java.util.Scanner;
public class summe {

	public static void main(String[] args) {
		try {
			Scanner eingabe = new Scanner(System.in);
		
			System.out.print("Willkommen. Tipp den namen ein den du "
					+ "switchen möchtest:> ");
			String Name = eingabe.nextLine();
			
			System.out.println("Der geswitchte Name ist :"+switche(Name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String switche(String name){
		int i= name.length()-1;
		String a = "";
		for( ; 0<=i; --i){
			a+=name.charAt(i);
		
		}
		return a;
	}
}
