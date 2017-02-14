package LernPaket;

public class MergeSortAusDemKopfVersuch1 {
	// das ganze top Down >> Rekursiv!
	// auch hier Comparable !
	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		// merge back to a[]
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (lo > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[lo++];
			else if (less(aux[j], aux[lo]))
				a[k] = aux[j++];
			else
				a[k] = aux[lo++];
		}
		
	}

	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void sort(Comparable[] array, Comparable[] aux, int lo, int hi) {
		if (lo >= hi)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(array, aux, lo, mid);
		sort(array, aux, mid + 1, hi);
		merge(array, aux, lo, mid, hi);
	}

	public static void sort(Comparable[] array) {
		Comparable[] aux = new Comparable[array.length];
		sort(array, aux, 0, array.length - 1);
	}

	public static void main(String[] args) {
		Comparable[] b = {"E","E","G","M","R","A","C","E","R","T"};
		sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
}