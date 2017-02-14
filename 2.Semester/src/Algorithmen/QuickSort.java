package Algorithmen;
public class QuickSort {
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		while (true) {
			while (less(a[++i], a[lo])) // find item on left to swap
				if (i == hi) break;
			while (less(a[lo], a[--j]))	// find item on reight to swap
				if (j == lo) break;
			if (i >= j)	 break;	// check if ponters cross
			exchange(a, i, j);
		}
		exchange(a, lo, j);
		return j;
	}
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}
/*						3-WAY-QUICKSORT
  private static void sort(Comparable[] a, int lo, int hi)
{
	if (hi <= lo) return;
	int lt = lo, gt = hi;
	Comparable v = a[lo];
	int i = lo;
	while (i <= gt)
	{
		int cmp = a[i].compareTo(v);
		if (cmp < 0) 				exch(a, lt++, i++);
		else if (cmp > 0) 		exch(a, i, gt--);
		else i++;
	}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
}*/
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}
/* 					QUICK-SELECT
  public static Comparable select(Comparable[] a, int k) {
		StdRandom.shuffle(a);
		int lo = 0, hi = a.length - 1;
		while (hi > lo) {
			int j = partition(a, lo, hi);
			if (j < k)  lo = j + 1;
			else if (j > k)  hi = j - 1;
			else 				return a[k];
		}
		return a[k];
	}*/
	public static boolean less(Comparable u, Comparable w){

		return u.compareTo(w)<0;
	}
	public static void exchange(Comparable []a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void main(String[] args){
		
	
	
	}
}






