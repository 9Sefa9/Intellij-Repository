package PanikRunde;

public class Palindrom {

	public static void main(String[] args){
		System.out.println(isPalindrom("Anna"));
	}
	public static boolean isPalindrom(String s){
		return Umdrehen.klein(s).equals(StringUmdrehen.reverseString(Umdrehen.klein(s)));
		
		
	}
}
