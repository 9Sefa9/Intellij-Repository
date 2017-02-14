package Algorithmen;


public class MergeSort {
	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		for (int k = lo; k <= hi; k++) 			
			aux[k] = a[k];
		
					int j = mid + 1;
		
					for (int k = lo; k <= hi; k++) {
			if (lo > mid)   									a[k] = aux[j++];
			else if (j > hi)									a[k] = aux[lo++];
			else if (less(aux[j], aux[lo])) 	     	a[k] = aux[j++];
			else													a[k] = aux[lo++];
		}
}															     
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if(lo >= hi)   return;
		int mid = lo + (hi - lo) / 2; // identifiziert die Mitte
		sort(a, aux, lo, mid); // sortiert linke Seite
		sort(a, aux, mid + 1, hi); // sortiert rechte Seite					  
		merge(a, aux, lo, mid, hi); 				 
	}
	
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}
	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	public static void main(String[] args) {
		Comparable[] b = { "M", "E", "R", "G", "E", "S", "O", "R", "T" };
		sort(b);
		for (Comparable inhalt : b) {
			System.out.print(inhalt + ",");
		}
	}
}