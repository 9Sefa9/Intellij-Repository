package LernPaket;

public class ShellSortHSortierungAusDemKopfVersuch2 {

	public void sort(Comparable a[]) {

		int h = 1;
		int N = a.length;
		
		while( h<=N/3) h = 3*h+1;
		
		while(h>=1){
			for(int i = 0; i<N; i++){
				for( int j = i; j>=h && less(a[j],a[j-h]); j-=h){
					exch(a,j,j-h);
					break;
				}
			}
			h = h/3;
		}
		
	}

	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void exch(Comparable[] a, int v, int w) {
		Comparable swap = a[v];
		a[v] = a[w];
		a[w] = swap;
	}
}
