package LernPaket;

public class ShellSortHSortierungAusDemKopfVersuch1 {
	
	public void sort(Comparable[] array){
		int hi = array.length;
		int h = 1;
		while(h<hi/3)  h = 3*h+1;
		
		while(h>=1){
			
			for(int i = 0; i<hi; i++){
				for(int j=i; j>=h;  j= j-h){
					if(less(array[j], array[j-h])){
						exchange(array, j, j-h);
					}
				}
			}
			h = h/3;
			
		}
	
	}
	public boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	public void exchange(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void main(String[] args) {
		Comparable [] einArray = {"S","O","R","T","E","X","A","M","P","L","E"};
		ShellSortHSortierungAusDemKopfVersuch1 array = new ShellSortHSortierungAusDemKopfVersuch1();
		
		array.sort(einArray);
		for(Comparable a: einArray){
			System.out.print(a);
		}	
	}
}
