package LernPaket;

public class ThreeWayDijkstraSelectQuickSortTOTALVersuch1 {

	public static int partition(Comparable[]a, int lo, int hi){
		int i = lo;
		int j = hi+1;
		while(true){
			while(less(a[++i],a[lo]))	
				if( i == hi)
					break;
			
			while(less(a[lo], a[--j]))
				if( j == lo)
					break;
			
			if(i>=j)
				break;
			
			exchange(a,i,j);
		}
		exchange(a,lo,j);
		return j;
	}
	public static void sort(Comparable[] a){
		StdRandom.shuffle(a);
		sort(a,0,a.length-1);
	}
	public static void sort(Comparable[]a, int lo, int hi){
		if(lo>=hi) return;
		int j = partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	public static Comparable select(Comparable[]a, int k){
		//das shufflen hat gefehlt !
		StdRandom.shuffle(a);
		int lo = 0;
		int hi = a.length-1;
		// da die werte in der partition immer geändert  werden, muss es in der while schleife vorliegen ( int j = partiiton(a,lo,hi);  )!! !	
		while(lo<hi){
			int j = partition(a,lo,hi);
			if(j<k)
				lo = j+1;
				
			else if(j>k)
				hi = j-1;
			else return a[k];			
		}
		return a [k];
	}
	public static void exchange(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	public static void main(String[] args){
		Comparable[] b = { 1, 5, 2, 4, 3 };
		System.out.println(select(b,4));
		sort(b);
		for (Comparable i : b) 
			System.out.print(i + ",");
	}
	
	public static void sorts(Comparable[]a,int lo, int hi){
	int lt = lo;
	int i = lo;
	int gt = hi;
	Comparable pivotelement = a[lo];

	while(i<=gt){
		int compare = a[i].compareTo(pivotelement);
		//wenn a[i] kleiner als pivot element, 
		if(compare <0)	 
			//tausch beide und inkrementiere
			exchange(a,lt++,i++);
		//ansonsten decrementiere gt
		else if (compare >0)
			exchange(a,i,gt--);
		
		//überspringt den gleichen pivot element
		else i++;

	}
	// wenn es erfolgreich partitioniert wurde, sortiere linke und rechte hälfte
	//der pivot elemente !
	sort(a,lo,lt-1);
	sort(a,gt+1,hi);
		
	}

	public static void sortThreeWayDijkstra(Comparable[]a, int lo , int hi){
		// für denn fall, dass lo größer sein sollte als hi, --> returne
		if (hi <= lo) return;
			
		int lt = lo;
			int i = lo;
			//pivot bestimmen
			Comparable partitionitem = a[lo];
			int gt = hi;
			while (i <= gt){
				
				int cmp = a[i].compareTo(partitionitem);
		
				if (cmp < 0) 
					exchange(a, lt++, i++);
			else if (cmp > 0) 
					exchange(a, i, gt--);
		
		else i++;
		
		}
		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
	}
}
