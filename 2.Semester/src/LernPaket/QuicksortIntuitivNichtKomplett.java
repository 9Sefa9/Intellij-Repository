package LernPaket;

public class QuicksortIntuitivNichtKomplett {

	private Comparable[] array;

	//Schritt 1: array shufflen
	public static void sort(Comparable[] array) {
		StdRandom.shuffle(array);
		sort(array,0,array.length-1);

	}
	//schritt 2: linke und rechte hälft in abhängigkeit des Partitions sortieren
	public static void sort(Comparable[] array, int lo, int hi){
		if(lo>=hi) return;
		int j = partition(array,lo,hi);
		//pivot element selbst, nicht sortieren !
		sort(array,lo,j-1);
		sort(array,j+1,hi);
	}
	//schritt 3: Partitionieren, vorsicht: es nutzt vorwiegend while schleifen !
	public static int partition(Comparable[] array, int lo, int hi){
		int i = lo;
		int j = hi+1;
		while(true){
			
			while(less(array[++i] , array[lo]))
				if(i == hi) break;
			
			while(less(array[lo], array[--j]))
				if(j == lo) break;
			
			if(i>=j) break;
			
			exchange(array,i,j);
		}
		exchange(array, lo, j);
		return j;
	}

	public static void exchange(Comparable[] array, int v, int w) {
		Comparable swap = array[v];
		array[v] = array[w];
		array[w] = swap;

	}

	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void main(String[] args) {
		Comparable[] b = {1,5, 2, 9,2,6,4,9,6,0,1,7,3,8,4,8,4,3};
		sort(b);
		for (Comparable i : b) {
			System.out.print(i + ",");
	}
	}
}
