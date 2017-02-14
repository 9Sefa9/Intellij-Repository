package LernPaket;

import Algorithmen.Bag;
import Algorithmen.MinPQ;
//Fehler : int e gehört nciht hierhin
// MST gehört nicht hierhin. es ist wirklich nur die erstelleung eines Graphen 
//Konstruktor besitzt einen integer v
// bag initialisierung in dem konstruktor
//addEdge hat ne häßliche funktioni ! adj[v] && adj[w]. add(e)  <<< soll heißen, dass wir uns in der adj liste die kanten einspeichern
// iterable fürs ausgeben von adj fehlt !
//
public class EdgeWeightedGraphAusDemKopfVersuch1 {
		
	public Bag<Edge> adj[];
	public int v;

	
	public EdgeWeightedGraphAusDemKopfVersuch1(int V){
	
		this.v=V;
		adj =(Bag<Edge>[])  new Bag[V];
		for(int v = 0; v<V; v++){
			adj[v] = new Bag<Edge>(); 
		}
		
	}
	public int V(){
		return v;
	}
	
	public void addEdge(Edge e){
		int v = e.either();
		int w = e.other(v);
		adj[v].add(e);
		adj[w].add(e);
	
	}
}