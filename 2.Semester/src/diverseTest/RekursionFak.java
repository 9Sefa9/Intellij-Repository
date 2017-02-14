package diverseTest;

import java.util.concurrent.SynchronousQueue;

public class RekursionFak {

	public static void main(String[] args){
		int n = 2;
		System.out.println(fakultaet(n));
	
	}
	public static int fakultaet(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n * fakultaet(n-1);
			
		}
	}
}
