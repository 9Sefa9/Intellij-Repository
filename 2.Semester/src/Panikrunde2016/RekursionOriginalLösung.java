package Panikrunde2016;

public class RekursionOriginalLoesung {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println("Die summe lautet: " + sum(a));
	
	
	
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int zahl = sc.nextInt();
		System.out.println(ungeraderTeiler(zahl));
		
		
		
		
	}
	public static int sum(int a){
		if(a == 0) return 0;
	
		//sum(4) ist gleich 4 	+ 	sum(3)
		//sum(3) ist gleich 3 	+ 	sum(2);
		//sum(2) ist gleich 2 	+ 	sum(1);
		//sum(1) ost gleich 1 	+	sum(0); --> return 0 sum(4) wartet, bis die innere schleife fertig ist
		return a+ sum(a-1);
	}
	public int ungeraderTeiler(int zahl){
		// beispiel 6 / 2 ist gleich 3 also der gr��te ungerader Teiler 
		// jede Gerade zahl ist durch 2 teilber, es hat kein rest.
		
		// wenn ungerade zahl 
		// uT(20), ut(10), ut(5)
		if(zahl % 2 != 0){
			return zahl;
		}
		else{
			
		}
	}
	
}
