package diverseTest;

public class Niklas {
	public static void main(String [] args) {
		int [] a = { 2,4,5,7,9};  //length = 5    length-1 = 4
						//0,1,2,3,4
						//1,2,3,4,5
		
		printRec(a,0);
	}
	public static void printRec(int [] a, int zahl){
		if(zahl < a.length){
			
			
			
			printRec(a,zahl+1);
			System.out.println(a[zahl]);  
		}
	
		public static void printRec(int [] a, int zahl){
		if(zahl < a.length){
			
			
			
			printRec(a,zahl+1);
			System.out.println(a[zahl]);  // wird garnicht aufgerufen
		}
	}
}


