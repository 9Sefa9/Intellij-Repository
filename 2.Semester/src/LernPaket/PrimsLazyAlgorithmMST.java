package LernPaket;

import Algorithmen.MinPQ;

public class PrimsLazyAlgorithmMST {
	private boolean marked[]; // MST vertices
	private Queue<Edge> mst;//MST edges
	private MinPQ<Edge> pq;	// PQ of edges ES SIND WIRKLICH NUR EINE QUEUE MIT EDGES UND GEWICHTEN !
	
	public PrimsLazyAlgorithmMST(EdgeWeightedGraph G){
		mst = new Queue<Edge>();
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		
		visit(G,0);							//annahme, dass G verbunden ist
		
		while ( !pq.isEmpty() && mst.size()<G.V()-1){
			//GRÖ?TE SCHWIERIGKEIT BEIM VERSTEHN! 
			Edge e = pq.delMin(); // entfernt ständig den kleinsten gewichtete kante e = v-w von dem PQ
			int v = e.either();
			int w = e.other(v);
			
			if(marked[v] && marked[w]) continue;	// mach weiter, wenn beide endpunkte gleich sind
			
			mst.enqueue(e);					//packe kante e in den Baum
			
			if(!marked[v]) visit(G,v);		// packe v oder w in den baum rein.
			if(!marked[w]) visit(G,w);
		}
		
	}
	public void visit(EdgeWeightedGraph G, int v){
		marked[v] = true;		// stecke v in den baum
		for(Edge e : G.adj(v)) 
			if(!marked[e.other(v)])			// stecke jede Kante e = v-w in die PQ, wenn diese noch nicht besucht wurde
				pq.insert(e);
	}
	public Iterable<Edge>mst(){
		return mst;
	}

}
