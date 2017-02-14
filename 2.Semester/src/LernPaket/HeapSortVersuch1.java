package LernPaket;

public class HeapSortVersuch1 {

	public static void sort(Comparable[] a) {
		int N = a.length;
		for(int k = N/2; k>=1; k--){
			sink(a,k,N);
		}
		
		while(1<N){
			exchange(a,1,N);
			sink(a,1,--N);
		}
	}

	public static void sink(Comparable[] a, int k, int N) {
		while (2 * k <= N) {
			int j = 2*k;
			if(j<N && less(a,j,j+1)) j++;
			
			if(!less(a,k,j)) break;
			exchange(a,k,j);
			k = j;
		}
	}
	public static void exchange(Comparable[] a, int i, int j) {
		Comparable swap = a[i - 1];
		a[i - 1] = a[j - 1];
		a[j - 1] = swap;
	}

	public static boolean less(Comparable[] a, int i, int j) {
		return a[i - 1].compareTo(a[j - 1]) < 0;
	}
}
