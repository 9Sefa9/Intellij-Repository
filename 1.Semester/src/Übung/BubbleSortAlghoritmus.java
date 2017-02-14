package Übung;


public class BubbleSortAlghoritmus {
	
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 4, 8 };
		sortieren(array);
		for(int s:array){
			System.out.println(s);
		}
	
		}
	public static void sortieren(int [] a){
		int temp = 0;
		boolean done = true;
		do{
			done = false;
			for (int i = 0; i < a.length-1; ++i) {
				if (a[i] > a[i + 1]) { // wenn der erse größer ist als
												// der zweite quasi 5,4
					temp = a[i];// dann speichere den ersten 5 in temp.
									// tausche beide indem du sagst:
					a[i] = a[i + 1];
					a[i + 1] = temp; // der temp ist jetzt array[i]
					done = true;
				}

			}

		}while(!done);
	}

}

