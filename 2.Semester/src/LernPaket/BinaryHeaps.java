package LernPaket;

public class BinaryHeaps<key extends Comparable<key>> {
	
	private key[] pq;
	private int N;
	
	public BinaryHeaps(int capacity){
		pq = (key[]) new Comparable[capacity+1];
	}
	public void insert(key item){
		pq[++N] = item;
		swim(N);
	}
	public boolean isEmpty(){
		return N==0;
	}
	public void swim(int k){
		// FEHLER WHILE BEDINUNG IST FALSCH ! k>1 
		while(k>1 && less(k/2,k))
			exchange(k,k/2);
		k = k/2;
	}
	public key delMax(){
		key max = pq[1];
		exchange(1,N--);
		sink(1);
		pq[N+1] = null;
		return max;
	}
	public void sink(int k){
		while(2*k<=N){
			int j = 2*k;
			// FEHLER IF BEDINUNG
			if(j<N && less(j,j+1)) j++;
			if(!less(k,j)) break;
			exchange(k,j);
			// der neue k = j
			k=j;
		}
	}
	
	public boolean less(int i, int j){
		return pq[i].compareTo(pq[j])<0;
	}
	public void exchange(int i, int j ){
		key swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
	}
}
