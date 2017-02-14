package LernPaket;

import Algorithmen.SelectionSort;

public class SelectionSortAusDemKopf  {

	public static void sort(Comparable [] array){
		int hi = array.length;
		
		for(int i=0; i<hi; i++){
				
			int min = i;
				
			//sucht nach dem minimum, und vergleicht es mit sich selbst
			for(int j=i+1; j<hi; j++){
				if(less(array[j] , array[min]))
					min = j;
			}
			
			
				exchange(array, i, min);
			
		}
	}
	public static boolean less(Comparable v , Comparable w){
		return v.compareTo(w)<0;
	}
	public static void exchange(Comparable [] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void main(String[] args){
		Comparable [] einArray = {6,3,5,2,1,8,7,9,4};
		
		
		sort(einArray);
		for(Comparable a: einArray){
			System.out.print(a);
		}
	}
}
