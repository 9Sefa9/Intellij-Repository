package LernPaket;

public class Edge implements Comparable<Edge> {
//ACHTUNG: WIR BRAUCHEN DIESE ABSTRACTION FÜR DIE EdgeWeightedGraph KLASSE
//	Was macht diese Klasse ? 
//	es erstellt eine gewichtete kante von e-w. WIRKLICH NUUR NE KANTE !, vergleichungen zwischen kanten, für either und other, siehe ganz unten!
	private final int v,w;
	private final double weight;
	
	public Edge(int v, int w, int weight){
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	//either endpoint : Einer der beiden Knoten dieser Kante
	public int either(){
		return v;
	}
	//other endpoint :  Der andere Knoten
	public int other(int vertex){
		if(vertex == v ) return w;
		else return v;
	}
	//compare edges by weight
	public int compareTo(Edge that){
		if ( this.weight < that.weight)return -1;
		else if(this.weight > that.weight ) return +1;
		else return 0;
	}
}

//			 	weight 
// V ---------------------------->W
// int v = e.either und int w = e.other(v);      PROCESSING AN EDGE !