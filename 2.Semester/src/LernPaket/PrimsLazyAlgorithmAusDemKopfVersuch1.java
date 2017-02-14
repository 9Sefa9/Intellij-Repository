package LernPaket;

import Algorithmen.MinPQ;

public class PrimsLazyAlgorithmAusDemKopfVersuch1 {


	public boolean marked[];
	public Queue<Edge> mst;
	public MinPQ<Edge> pq;
	
	public PrimsLazyAlgorithmAusDemKopfVersuch1(EdgeWeightedGraph G){
		mst = new Queue<Edge>();
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		
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
		// steck alle eingehende verbindungen in die Priority queue rein!
		marked[v] = true;
		for(Edge w: G.adj(v)){
			if(!marked[w.other(v)])
				pq.insert(w);
		
		}
	}

}
