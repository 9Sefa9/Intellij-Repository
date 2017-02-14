package LernPaket;

import Algorithmen.MinPQ;
//queue hat gefehlt !
public class KruskalAlgorithmMSTAusDemKopfVersuch1 {
	public Queue<Edge> mst = new Queue<Edge>();
	
	public KruskalAlgorithmMSTAusDemKopfVersuch1(EdgeWeightedGraph G){
		MinPQ<Edge> pq = new MinPQ<Edges>(G.edges());
		UF uf = new UF(G.V());
		
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
	public Iterable<Edge> edges(){
		return mst;
	}	
}
