package LernPaket;

import Algorithmen.Bag;

//ACHTUNG: HIER WURDE NURE IN GRAPH ERSTELLT ! 
//WENN DU WISSEN WILLST, WIE DIE TIEFENSUCHE FUNKTIONIERT,DANN:
//LERNPACKET ---> DepthFirstSearch.java
public class UndirectedGraph {
	private final int V;
	private Bag<Integer>[] adj;

	public UndirectedGraph(int V) {
		this.V = V;
		adj = (Bag<Integer>[]) new Bag[V];
		for (int v = 0; v < V; v++)
			//für jedes einzel elemnt wird ein bag erzeugt
			adj[v] = new Bag<Integer>();
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}
}
