package LernPaket;

import Algorithmen.Bag;
//Was macht diese Klasse ? 
//Es erstellt einen leeren graphen mit V vertices, addEdge packt eine gewichtete kante in DIESEN Graphen, usw
//ACHTUNG : Maintain vertex-indexed array of Edge lists.
//Allow self-loops and parallel edges.
public class EdgeWeightedGraph {
	
	private final int V;
	private Bag<Edge>[] adj;
	
	public EdgeWeightedGraph(int V){
		this. V = V;
		adj = (Bag<Edge>[]) new Bag[V];
		
		for( int v = 0; v<V; v++)
			adj[v] = new Bag<Edge>();
	}
	//either: einer der beiden Knoten dieser Kante
	//other:  der andere knoten
	public void addEdge(Edge e){
		int v = e.either();
		int w = e.other(v);
	// add edge to both adjacency lists	
		adj[v].add(e);
		adj[w].add(e);
	}
	public Iterable<Edge> adj( int v){
		return adj[v];
	}
	//uninteressant: eine methode um selfloop zu ermitteln
	public Iterable<Edge> edges() {
        Bag<Edge> list = new Bag<Edge>();
        for (int v = 0; v < V; v++) {
            int selfLoops = 0;
            for (Edge e : adj(v)) {
                if (e.other(v) > v) {
                    list.add(e);
                }
                // only add one copy of each self loop (self loops will be consecutive)
                else if (e.other(v) == v) {
                    if (selfLoops % 2 == 0) list.add(e);
                    selfLoops++;
                }
            }
        }
        return list;
    }
	
	public int V() {
        return V;
	}
}
