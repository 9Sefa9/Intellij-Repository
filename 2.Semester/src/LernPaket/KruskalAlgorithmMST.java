package LernPaket;

import java.io.*;

//Laufzetiverhalten : O(E log E) in worst case
//Laufzeitverhalten : O(E log* V) If edges are already sorted

import Algorithmen.MinPQ;
import Algorithmen.QuickUnionMitPathCompression;
// obwohl union find oder Min Priority queue nicht funktioniert
//, können diese implemeneitert werden, weil es nunmal so in den folien steht 

public class KruskalAlgorithmMST {

	private Queue<Edge> mst;
	public MinPQ<Edge> pq;
	
	public KruskalAlgorithmMST(EdgeWeightedGraph G){	
		//spezielle G.edges() methode mit self loop detection
		mst = new Queue<Edge>();	
		pq = new MinPQ<Edge>(G.edges());
			
		QuickUnionMitPathCompression uf = new QuickUnionMitPathCompression(G.V());

//			solange die queue nicht leer ist und die größe vom MST 
//			kleiner ist als die anzahl der Knoten im edge-weighted Graph
//			v-1, da der graph selbst bei 0 anfängt
		while (!pq.isEmpty() && mst.size() < G.V()-1){
				
				Edge e = pq.delMin();
				int v = e.either(), w = e.other(v);
			if (!uf.connected(v, w))
			{
					uf.union(v, w);
					mst.enqueue(e);
			}
	  }
}
	public Iterable<Edge> mst() {
		return mst;
	}
}
