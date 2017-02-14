package LernPaket;

import Algorithmen.*;

public class QuickUnionAusDemKopf {

	private int[] id;
	private  int[] size;
	private  int count; // ANZAHL DER KOMPONENTE

	public  QuickUnionAusDemKopf(int N) {
		id = new int[N];
		size = new int[N];

		count = N;
		for (int i = 0; i < N; i++) {
			id[i] = i; 
			size[i] = 1;
		}

	}
	public int  count(){
		return count;
	}
	public boolean connected(int p, int q){
		return find(p) == find(q);
	}
	public int find(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
			size[i]	= i;
		}
		return i;
	}
	public  void union(int p , int q){
		
	int rootp = find(p);
	int rootq = find(q);
//	id[rootp] = rootq;
	if(rootp == rootq) return;
	
		if(size[rootp] <size[rootq]){
			id[rootp] = rootq;
			size[rootq] += size[p];
		}else if( size[rootp] > size[rootq]){
			id[rootq] =rootp;
			size[rootp] += size[rootq];
		}
		//DA DER ROOT VERWEIS AUF EIN ANDERES ROOT ZEIGT: count--; 
		count--;
	}
	
}
