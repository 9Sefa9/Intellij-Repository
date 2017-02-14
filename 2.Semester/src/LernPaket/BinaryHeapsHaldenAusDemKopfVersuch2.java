package LernPaket;
// probleme beim schreiben von swim und sink
public class BinaryHeapsHaldenAusDemKopfVersuch2<key extends Comparable<key>> {
	public key[] pq;
	public int N;
	public BinaryHeapsHaldenAusDemKopfVersuch2(int capacity){
		pq = (key[]) new Comparable[capacity+1];//da wir nicht bei 0 anfangen
	}
	
	
	public boolean isEmpty(){
		return N ==0;
	}
	public key delMax(){
		key max = pq[1];
		exchange(1,N--);
		sinkdown(1);
		pq[N+1] = null;
		return max;
		
	}
	public void insert(key item){
		pq[++N] = item;
		swimup(N);
	}
	// K muss größer als 1 sein
	public void swimup(int k){
		//k ist der node
		while(less(k/2 ,k)){
			exchange(k/2,k);
			k = k/2;
		}
	}
	public void sinkdown(int k){
		// solange das kind kleiner ist als N (in dem priorityqueue)
		while(2*k <=N){
			int j = 2*k;
			if(j<N && less(j,j+1))
				j++;
		if(!less(k,j)) break;
		exchange(k,j);
		k = j;
		}
	}
	
	public void exchange( int i, int j){
		key swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;                                                                                                                                                     
	}
	public boolean less(int a, int b){
		return pq[a].compareTo(pq[b])<0;
	}
}
