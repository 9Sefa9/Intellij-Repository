package LernPaket;
import java.util.*;
public class summeRekursion {

	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		int a = eingabe.nextInt();
		System.out.println("Summe lautet :  "+sum(a));
	
	
		
		for(int i = 0; i<10; i++)
			if(i == 10)
				System.out.println(10);
		
		
	}
	public static int sum(int a){
		if(a == 0) 
			return a;
		
		else 
			return a+sum(a-1);
	}

	public void niklas(){
		

	}

}

