package LernPaket;

import Algorithmen.MinPQ;

public class PrimsLazyAlgorithmAusDemKopfVersuch2 {
	public boolean marked[];
	public Queue<Edge> mst;
	public MinPQ<Edge> pq;
	
	public PrimsLazyAlgorithmAusDemKopfVersuch2(EdgeWeightedGraph G){
		marked = new boolean[G.V()];
		mst = new Queue<Edge>();
		pq = new MinPQ<Edge>();
		
		visit(G,0);
		while(!pq.isEmpty() && mst.size()<G.V()-1){
			Edge e = pq.delMin();
			int v = e.either();
			int w = e.other(v);
			
			if(marked[v] && marked[w]) continue;
			mst.enqueue(e);
			if(!marked[v]) visit(G,v);
			if(!marked[w]) visit(G,w);
		}
	}
	public void visit(EdgeWeightedGraph G, int v){
		marked[v] = true;
		
		for(Edge e: G.adj(v) )
			if(!marked[e.other(v)])
				pq.insert(e);			
	}
	// iterable immernoch ungenau !
	public Iterable<Edge> mst(){
		return mst;
	}
}
