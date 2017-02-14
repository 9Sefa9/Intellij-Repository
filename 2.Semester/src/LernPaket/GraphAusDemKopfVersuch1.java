package LernPaket;

import Algorithmen.Bag;

public class GraphAusDemKopfVersuch1 {
	public final int V;		
	public int E;
	public Bag<Integer> []adj;
	
		public GraphAusDemKopfVersuch1(int V){
			this.V = V;
			adj = (Bag<Integer>[]) new Bag[V];
			for(int v = 0; v<V; v++)
				adj[v]  = new Bag<Integer>();
		}
		public void addEdge(int v, int w){
			adj[v].add(w);
			adj[w].add(v);
		}
		public int E(){
			return E;
		}
		public int V(){
			return V;
		}
		public Iterable<Integer> adj(int v){
			return adj[v];
		}
}
