package LernPaket;

import java.util.*;
public class Maximum {
		public static void main(String[] a){
		
			int max= 0;
			
			System.out.println("Maximum: "+maximum(max));
		
		}
		public static int maximum(int max){
			Scanner eingabe = new Scanner(System.in);
			
			int sum = eingabe.nextInt();
			
			if(sum == 0) 
				return max;
		
			else
				if(sum>max) 
					max = sum;
				
					return maximum(max);
			
				
			
				
		}
}
