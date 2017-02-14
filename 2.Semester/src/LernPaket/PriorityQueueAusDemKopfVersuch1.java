package LernPaket;

public class PriorityQueueAusDemKopfVersuch1<Key extends Comparable<Key>>{
	//BEVOR DU WEITER LIEST: 
	//Dieser Pirorityqueue konnte nciht erfolgreich kompiliert werden.
	// fakt ist: er gibt den höchsten wert aus dem Queue aus
	private Key[] pq; // pq[i] = ith element on pq
	private int N; // number of elements on pq

	public PriorityQueueAusDemKopfVersuch1(int capacity){
	 pq = (Key[]) new Comparable[capacity]; 
	 }

	public boolean isEmpty() {
		return N == 0;
	}

	public void insert(Key x) {
		pq[N++] = x;
	}

	public Key delMax() {
		int max = 0;
		for (int i = 1; i < N; i++)
			if (less(max, i))
				max = i;
		exch(max, N - 1);
		return pq[--N];
	}
	public void exch( int v, int m){
		int swap = v;
		v = m ;
		m= swap;
	}
	
	public boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	public static void main(String[] args){
		PriorityQueueAusDemKopfVersuch1<Integer> bla = new PriorityQueueAusDemKopfVersuch1<Integer>(10);
		
	}

}

