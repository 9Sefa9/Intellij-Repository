package LernPaket;

public class QuickSortAusDemKopfVersuch1 {
	// zuerst shufflen, pivot element wählen, dannach Partitionieren(links
	// kleiner recht größer als pivot element
	// dann links/rechts sortieren und ausgeben

	public static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;

		while (true) {
			//scannt von links nach rechts 
			while (less(a[++i], a[lo]))
				if (i == hi)
					break;
			
			
			// --j muss hi+1 sein, da sie ständig dekrementiert wird
			// scannt von rechts nach links
			while (less(a[lo], a[--j]))
				if (j == lo)
					break;
			
			
			//wenn sich i mit j überschneidet, soll es aufhören
			if (i >= j)
				break;
			
			
			//tausche jetzt i mit j 
			exchange(a, i, j);
		}
		// wenn das ganze vorüber ist, tausche das pivot element lo mit j
		exchange(a, lo, j);
		return j;
	}
	public static Comparable select(Comparable[] array, int k){
		StdRandom.shuffle(array);
		int lo = 0;
		int hi = array.length-1;
		while(lo<hi){
			//partitionieren, checken ob der wert kleiner als k oder größer als k ist,dementsprechend setten
			int j = partition(array,lo,hi);
			if(j >k )	 hi = j-1;
			else if(j<k)    lo = j+1;
			else return array[k];
		
		}
		return array[k];
	
	}
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	public static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1); // sortiert links VOR dem pivot element
		sort(a, j + 1, hi);// sortiert recht NACH dem pivot element
	}

	public static void exchange(Comparable[] a, int i, int v) {
		Comparable swap = a[i];
		a[i] = a[v];
		a[v] = swap;
	}

	public static boolean less(Comparable b, Comparable c) {
		return b.compareTo(c) < 0;
	}

	public static void main(String[] args) {
		Comparable[] b = { 1, 5, 2, 4, 3 };
		System.out.println(select(b,4));
		for (Comparable i : b) {
			System.out.print(i + ",");

		}

	}
}
