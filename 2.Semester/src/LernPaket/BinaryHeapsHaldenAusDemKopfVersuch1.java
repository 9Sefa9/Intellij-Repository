package LernPaket;
// ACHTUNG VOR DEM LESEN :
// es ist keine sortierung ! es ist eine Binärische Heap ordnung!
// Binary heaps arbeitet hauptsächlich mit priority Queues. 
// manche methoden gehören dem priority queue an.
//heap sort gehört einer anderen klasse an.

public class BinaryHeapsHaldenAusDemKopfVersuch1<key extends Comparable<key>> {
	private key[] pq;
	private int N;
	
	// Queue erstellen und dazu eine Kapazität festlegen !
	public BinaryHeapsHaldenAusDemKopfVersuch1(int capacity){
		pq = (key[]) new Comparable[capacity+1];//da wir nicht bei 0 anfangen
	}
	// wenn kapazität leer , dann ist sie halt leer 
	public boolean isEmpty(){
		return N == 0;
	}
	// inserte ein neues key. Heap ordnung ist nicht mehr ! 
	// deshalb swim nach oben
	public void insert(key x) {
		pq[++N] = x;
		swimup(N);
	}

	// 2nlogn vergleiche
	// entfernt das maximum im heap ( in dem falle der root )
	public key delMax() {
		//erstes Element ist der root 
		key max = pq[1];
		// tausche root mit dem letzten heap-order-element
		exchange(1, N--);
		//1 ist jetzt der root. da er der nichtt der größte ist ->sink
		sink(1);
		// das letzte element ist nicht mehr.
		pq[N + 1] = null;
		return max;
	}
	public void swimup(int k) {
		// K/2 ist der node von dem Elternteil
		// wenn der Parent, kleiner als Chil --> exchange
		while (k > 1 && less(k / 2, k)) {
			exchange(k, k / 2);
			// setze parent(zuvor child) auf k/2, da er jetzt ein parent ist !
			k = k / 2;
		}
	}
	public void sink(int k) {
		while (2 * k <= N) {
			// linkes kind
			int j = 2 * k;
			// wenn linkes kind kleiner als rechtes kind, erhöhe linkes kind
			if (j < N && less(j, j + 1))
				j++;
			// wenn k(in dem falle ist k = node bzw der root) größer sein sollte als linkes kind --> break;
			if (!less(k, j))
				break;
			// vertausche rroot(also K) mit linkes kind
			exchange(k, j);
			k = j;
		}
	}
	public boolean less(int i, int j) {
		// wir bewegen uns im PriorityQueue!
		return pq[i].compareTo(pq[j])<0;
	}
	public void exchange(int k, int i) {
		// auch hier bewgen wir uns im PriorityQueue
		key tausche = pq[k];
		pq[k] = pq[i];
		pq[i] = tausche;
	}
}
