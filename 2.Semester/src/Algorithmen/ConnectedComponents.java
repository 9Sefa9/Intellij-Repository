package Algorithmen;

public class ConnectedComponents {

	private boolean marked[];
	private int id[];    //id[v] beinhaltet z.b den id vom component bezüglich v
	private int count; //anzahl der componente 
	private int edgeTo[];

	//Datenstrukturen initialisieren
	public ConnectedComponents(Graph G){
		marked = new boolean[G.V()];
		id = new int[G.V()];
		edgeTo = new int[G.V()];
		
		for(int v = 0; v<G.V(); v++){
			if(!marked[v]){
				depthFirstSearch(G,v);
				count++;
			}
		}
	}
	public void depthFirstSearch(Graph G, int v){
		marked[v] = true;
		
		id[v] = count;// neu dazu gekommen
		
		for(int w: G.adj(v)){
			if(!marked[w]){
				depthFirstSearch(G, w);
				edgeTo[w] = v;
			}
			
		}
		
	}
	//anzahl der componente
	public int count(){
		return count;
	}
	//id von einem Knoten
	public int id(int v){
		return id[v];
	}
	//selbsterklärend!
	public boolean connected(int v, int w){
		return id[v] == id[w];
	}
}
