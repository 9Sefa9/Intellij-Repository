package LernPaket;

import Algorithmen.Graph;

//ACHTUNG: 
//Digraph : Finde alle Knoten, die von dem Knotenpunkt S erreichbar sind.
//Digraph : jedes Programm ist ein Digraph, jede datenstruktur auch !
public class DepthFirstSearch {

	private boolean[] marked;

	
	// Undirected Graph : constructor marks vertices connected to s
	// Directed Graph : constructor marks vertices reachable to s
	public DepthFirstSearch(Graph G, int s) {
		marked = new boolean[G.V()];

		depthFirstSearch(G, s);
	}

	private void depthFirstSearch(Graph G, int v) {
		marked[v] = true;
		// durchforced die knoten in der adjacenten liste
		for (int w : G.adj(v))
			if (!marked[w]) {
				depthFirstSearch(G, w);

			}
	}

	// client can ask whether any vertex is connected to s (digraph:reachable)
	public boolean visited(int v) {
		return marked[v];
	}
}
