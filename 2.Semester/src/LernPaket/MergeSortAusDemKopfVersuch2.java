package LernPaket;

public class MergeSortAusDemKopfVersuch2 {
		//BITTE LESEN BEVOR DU WEITER LIEST !: achte darrauf , dass die signatur, 
	// erst mit dem original, dann mit dem kopie Array folgt !
		
	
	public static void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi){
	//erstellt kopie und hier fehlt auch : k<= hi !
		for(int k = lo; k<=hi; ++k){
			aux[k] = array[k];
		}
		
		int j = mid+1;
		// das fehlte : i< = hi !!!
		for(int k = lo; k<=hi; k++){
			if(lo>mid)												
				array[k] = aux[j++];
			
			else if ( j>hi)										
				array[k] = aux[lo++];
			// fehler gefunden ! : wir bewegen und im aux array.  der endvorgang wird im original array beendet
			
			else if (less(aux[j], aux[lo]))	 			
				array[k] = aux[j++];
			
			else array[k] = aux[lo++];	
		}	
	}
	
	public static void sort(Comparable[]array, Comparable[]aux, int lo, int hi){
		if( lo>=hi) 
			return;
		int mid = lo+(hi-lo)/2;
		sort(array,aux,lo, mid);
		sort(array,aux,mid+1,hi);
		merge(array,aux,lo,mid,hi);
	}
	
	//erstellt den copy array aux
	public static void sort(Comparable[] array){
		Comparable[] aux = new Comparable[array.length];
		sort(array,aux,0,array.length-1);
	}
	public static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	public static void main(String[] args){
		Comparable[] b = {"E","E","G","M","R","A","C","E","R","T"};
		sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
