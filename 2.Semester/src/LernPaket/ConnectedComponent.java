package LernPaket;

import Algorithmen.Graph;
//ACHTUNG: ICH HABE HIER AUS SPAß, DEN DFS SOFRT ZUEINEM CONNNECTED COMPONENT GEMACHT
public class ConnectedComponent {

	public boolean marked[];
	public int count;
	public int id[];

	public ConnectedComponent(Graph G){
		marked = new boolean[G.V()];
		id = new int [G.V()];

		for(int v = 0; v<G.V(); v++){
				dfs(G,v);
				count++;
		}
	}
	// hier muss irgendwie, die momentan betrechtene v, in das id array eingetragen werden
	public void dfs(Graph G, int v){
		marked[v] = true;
	// das lösen wir durch:
		id[v] =count;	
		
		for(int w: G.adj(v)){
			if(!marked[w]){
				dfs(G,w);
			}
		}
	}
	public int count(){
		return this.count;
	}
	public int id(int v){
		return id[v];
	}
	public boolean connected(int v, int w){
		return id[v] == id[w];
	}
	

}
