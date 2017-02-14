package LernPaket;

import Algorithmen.MinPQ;
import Algorithmen.QuickUnionMitPathCompression;

public class kruskalAlgorithmMSTAusDemKopfVersuch2 {

	public Queue<Edge> mst;
	public MinPQ<Edge> pq;
	
	public kruskalAlgorithmMSTAusDemKopfVersuch2(EdgeWeightedGraph G){
		mst = new Queue<Edge>();
		pq = new MinPQ<Edge>(G.edges());
		QuickUnionMitPathCompression uf = new QuickUnionMitPathCompression(G.V());
		
		while(!pq.isEmpty() && mst.size()<G.V()-1){
			Edge e = pq.delMin();
			int v = e.either();
			int w = e.other(v);
			
			if(!uf.connected(v,w)){
				uf.union(v,w);
				mst.enqueue(e);
			}
			
			
			
			
		}
	}
	public Iterable<Edge> mst(){
		return mst;
	}
}
