package LernPaket;

import Algorithmen.Graph;

public class BreadthFirstSearchAusDemKopfVersuch2 {

	public boolean marked[];
	public int distTo[];
	public int edgeTo[];

	// whiel schleife hat gefehlt er soll die ganze zeit machen bis queue leer
	// KEINE REKURSION!
	public void bfs(Graph G, int s) {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(s);
		
	
		marked[s] = true;
		distTo[s] = 0;
		
		while (!q.isEmpty()){
			int v = q.dequeue();
			for (int w : G.adj(v)) {
				if(!marked[w]){
					q.enqueue(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] +1;
				}
				
		}
		}

	}
}
