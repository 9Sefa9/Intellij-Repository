package LernPaket;

public class EdgeAusDemKopfVersuch2 implements Comparable<EdgeAusDemKopfVersuch2>{

	private int v;
	private int w;
	private double weight;
	
	public EdgeAusDemKopfVersuch2(int v, int w , int weight){
		this.v= v;
		this.w = w;
		this.weight = weight;
		
	}
	public int either(){
		return v;
	}
	public int other(int vertex){
		if(vertex == v) return w;
		else return v;
	}
	//ich habte hier vergessen compare to einzusetzen
	public int compareTo(EdgeAusDemKopfVersuch2 that){
		if(this.weight>that.weight) return +1;
		else if(this.weight<that.weight) return -1;
		else return 0;
	}

}
