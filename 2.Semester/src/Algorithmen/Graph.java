package Algorithmen;
//ACHTUNG: WENN DU AUS DIESEM UNGERICHTETEN,EIN GERICHTETEN
//GRAPH MACHEN MÖCHTEST: ENTFERNE adj[w].add[v]; UND 
//DEN NAMEN DIESER KLASSE IN DiGraph STATT Graph !
public class Graph {
	private final int V; // anzahl Knoten(fester wert)
	private int E; // anzahl kanten
	private Bag<Integer>[] adj;

	public Graph(int V) {
		this.V = V;
		adj = (Bag<Integer>[]) new Bag[V];
		for (int v = 0; v < V; v++)
			adj[v] = new Bag<Integer>();
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}
}