package LernPaket;

public class InsertionSortAusDemKopfVersuch1 {
	public void sort(Comparable[] array){
		int hi = array.length;
		for(int i=0; i<hi; i++){
			for(int j = i; j>0; j--){
				if(less(array[j], array[j-1])){
					exchange(array, j, j-1);
				}
			}
		}
	}
	public static void main(String[] args){
		Comparable [] einArray = {"A","S","O","M","E","W","H","A","T","L","O","N","G","E","R","I","N","S","E","R","T","I","O","N","S","O","R","T"};
		InsertionSortAusDemKopfVersuch1 array = new InsertionSortAusDemKopfVersuch1();
		
		array.sort(einArray);
		for(Comparable a: einArray){
			System.out.print(a);
		}
	}
	
	public boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	public void exchange(Comparable[] array, int i, int j){
		Comparable swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
