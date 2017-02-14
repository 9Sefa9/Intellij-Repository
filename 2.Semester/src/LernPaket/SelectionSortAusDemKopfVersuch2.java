package LernPaket;

public class SelectionSortAusDemKopfVersuch2 {

	public void sort(Comparable[] a){
		
		//die i schleife geht von vorne bis nach hinten durch!
		for(int i=0; i<a.length; i++){
			int min = i;
			// durchsucht das kleinste Element in abhängigkeit zum i 
			for(int j = i+1; j<a.length; ++j){
				//wenn j kleiner als min, dann setze j gleich min << selbstverständlich
				if(less(a[j], a[min])){
					min = j;
				}				
			}
			//vertausche i durch min
			exchange(a,i,min);

		}
	}
	public static void main(String[] args){
		Comparable [] einArray = {6,3,5,2,1,8,7,9,4,4,7,2,9,5,1,6,9,5,7,3};
		SelectionSortAusDemKopfVersuch2 array = new SelectionSortAusDemKopfVersuch2();
		
		array.sort(einArray);
		for(Comparable a: einArray){
			System.out.print(a);
		}
	}
	// Die Variable müssen Comparable sein !
	public boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	
	}
	public void exchange(Comparable [] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
