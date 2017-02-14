package KontrollUndFunktionsstrukturen;
public class Rekursion {
	
	/*
	 *  einfache Beispiel für die Rekursion.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countDown(10);
		
	}

	public static void countDown ( int n ) {
	    	//wenn n kleiner als 0
		if ( n <= 0 ) {
	        System.out.println("BOOM!");
	        return;
	    }else {
	    System.out.print(n+ ", ");
	    countDown(n - 1);
	    }
	
	}
	
	public static void countUp (int n) {
		
		if (n>10) {
			System.out.println("BOOM!");
	    	return;
	    	}else {
			System.out.println(n);
			countUp (n+1);
			
		}
	}	
	
	
}