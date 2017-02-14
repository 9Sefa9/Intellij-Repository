package LernPaket;

import Algorithmen.Bag;
import Algorithmen.Graph;
// ich habe vergessen v zu ernenen und this anzuwenden
public class DepthFirstSearchAusDemKopfVersuch1 {

	private int edgeTo[];
	private boolean marked[];
	
//	find vertices connected to s !
	public DepthFirstSearchAusDemKopfVersuch1(Graph G, int s){

		marked = new boolean[G.V()];
		
		dfs(G,s);
	}
	public void dfs(Graph G, int v){
		marked[v] = true;
		//tracen xDD
		for(int w: G.adj(v)){
//			 er fängt quasi immer von vorne an, mit dem nächsten element.
			if(!marked[w])
			{
				dfs(G,w);
				edgeTo[w] = v;
			}
				
		}
	}
}
