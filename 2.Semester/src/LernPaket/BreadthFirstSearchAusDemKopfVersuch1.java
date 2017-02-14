package LernPaket;

import Algorithmen.Graph;

//ACHTUNG ! ES ERSTELLT KEINEN KONSTRUKTOR ! ALLES ON THE FLY
public class BreadthFirstSearchAusDemKopfVersuch1 {
	private boolean marked[];
	private int distTo[];
	private int edgeTo[];

	
	public void BFS(Graph G, int s) {
		// das ist nur der anfangssequenz
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(s);
		marked[s] = true;
		distTo[s] = 0;

		// 1. erst aus queue rausnehmen, behandeln(marked,distto,edgeto,) , fertig!
		while (!q.isEmpty()) {
			// die zu behandelner integer
			int v = q.dequeue();
			for (int w : G.adj(v)) {
				if (!marked[w]) {
					q.enqueue(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] +1;
				}
			}

		}
	}
}
