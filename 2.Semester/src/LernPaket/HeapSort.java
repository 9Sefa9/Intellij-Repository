package LernPaket;


//ACHTUNG: less wird mit einem Comparable und exchange mit einem Object array versehen.  das ganze dann minus 1 
public class HeapSort {
	public static void sort(Comparable[] a) {
		int N = a.length;
		
		for (int k = N / 2; k >= 1; k--)
			sink(a, k, N);
		
		while (N > 1) {
			exchange(a, 1, N);
			sink(a, 1, --N);				//das letzte element vom a.length wird nicht nullsondern, es bleibt !
		}
	}
	public static void sink(Comparable[] a, int k, int N) {
		while (2 * k <= N) {
			// linkes kind
			int j = 2 * k;
			// wenn linkes kind kleiner als rechtes kind, erhöhe linkes kind
			if (j < N && less(a, j, j + 1))
				j++;
			// wenn k nicht kleiner sein sollte als linkes kind --> break;
			if (!less(a,k, j))
				break;
			// vertausche k mit linkes kind
			exchange(a, k, j);
			k = j;
		}
	}

	public static void exchange(Object[] pq, int i, int j) {
		Object swap = pq[i - 1];
		pq[i - 1] = pq[j - 1];
		pq[j - 1] = swap;
	}

	public static boolean less(Comparable[] pq, int i, int j) {
		return pq[i - 1].compareTo(pq[j - 1]) < 0;
	}

	public static void main(String[] args) {
		Comparable[] b = { "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E" };
		sort(b);
		for (Comparable s : b) {
			System.out.print(s);
		}
	}
}
