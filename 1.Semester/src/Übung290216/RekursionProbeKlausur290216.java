package Übung290216;

public class RekursionProbeKlausur290216 {

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 7, 9 };
		printRec(a, 0);
	} 

	
	public static void printRec(int[] array, int index) {
			//index ist nicht gleich 5
		if (index != array.length) {
			
			printRec(array, index+1);
			System.out.println(array[index]);		
		}

	}
}