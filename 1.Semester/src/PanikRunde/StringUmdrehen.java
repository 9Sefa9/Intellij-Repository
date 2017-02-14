package PanikRunde;

public class StringUmdrehen {
	public static void main(String[] args){
	
		System.out.println(reverseString("seniseviyorum"));
	}
	public static String reverseString(String a ){
		String result ="";		 //z.b 5>=0   --i  == 4>=0....   3>=0....0=0
		for(int i = a.length()-1; 0<=i; i--){
			result += a.charAt(i);
		}
		return result;
	    
	}
		
	}

