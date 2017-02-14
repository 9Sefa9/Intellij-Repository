package LernPaket;

public class EdgeAusDemKopfVersuch1  implements Comparable<EdgeAusDemKopfVersuch1> {
// simuliere aus dem kopf, wie eine normale kante aussieht
	private final int v,w;
	private final double weight;
	
	public EdgeAusDemKopfVersuch1(int v, int w, double weight){
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	public int either(){
		return v;
	}
	public int other(int vertex){
		if (vertex == v) return w;
		else return v;
	}
	//compare edges by weight
	public int compareTo(EdgeAusDemKopfVersuch1 that){
		if(this.weight> that.weight) return +1;
		else if(this.weight<that.weight) return -1;
		else return 0;
	}
	
}
