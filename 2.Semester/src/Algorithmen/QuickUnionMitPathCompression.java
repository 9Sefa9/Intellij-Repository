package Algorithmen;

public class QuickUnionMitPathCompression {

	private static int  [] id;
	private static int [] size;
	private static int count;
	
	public static void  QuickUnionUF(int N){
	
		id = new int[N];
		size = new int[N];
		
		for(int i= 0; i<N; i++){
			id[i]= i;
			count = 1;
		}	
	}
	public static int find(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
			count++;
			size[i] = i;
		}
		return i;
	}
	public static boolean connected(int p, int q){
		return find(p) == find(q);
	}
	public static void union(int p, int q){
		
		int rootp = find(p);
		int rootq = find(q);
	//	id[rootp] = rootq;
		if(size[rootp]<size[rootq]){
			id[rootp] = rootq;
			size[rootq] += size[rootp];
		}
		else if(size[rootp]>size[rootq]){
			id[rootq] = rootp;
			size[rootp] += size[rootq];
		}	
	}

}
