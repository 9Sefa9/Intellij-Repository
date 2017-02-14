package OOP;

public class HyperCoord extends TexCoord {
	//zwei möglichkeiten: entweder einen konstruktor mit super erstellen, rest mit this. oder alles mit super erstellen!
	/*
    //1. MÖGLICHKEIT --> nicht sehr effizient, aber alle float variablen belegbar!:
	  
	 
	public HyperCoord(float a, float b, float c,float d, float e, float f, float g ){
			super(a,b,c,d,e,f,g);
	}
	public HyperCoord(float a){
		this(a,0,0,0,0,0,0);
	}
	public HyperCoord(float a, float b){
		this(a,b,0,0,0,0,0);
	}
	public HyperCoord(float a, float b, float c){
		this(a,b,c,0,0,0,0);
	}
	*/
	/*
	//2.MÖGLICHKEIT! --> Effizienter!
	
	public HyperCoord(float a){
			super(a,0.0f, 0.0f, 0.0f, 0.0f,0.0f,0.0f);
	}
	public HyperCoord(float a, float b){
			super(a,b,0.0f, 0.0f, 0.0f,0.0f,0.0f);
	}
	public HyperCoord(float a, float b, float c){
			super(a,b,c, 0.0f, 0.0f,0.0f,0.0f);
	}
	*/
	public static void main(String[] args) {
		HyperCoord hc = new HyperCoord(1.0f);
		HyperCoord h2 = new HyperCoord(1.0f, 2.0f);
		HyperCoord h3 = new HyperCoord(2.0f, 6.5f, 4.2f);
		
		if(hc.a == 1.0f && hc.b == 0.0f && hc.c == 0.0f && hc.d == 0.0f &&
			hc.e == 0.0f && hc.f == 0.0f && hc.g == 0.0f) {
			System.out.println("ok");
		}
		
		if(h2.a == 1.0f && h2.b == 2.0f && h2.c == 0.0f && h2.d == 0.0f &&
			h2.e == 0.0f && h2.f == 0.0f && h2.g == 0.0f) {
			System.out.println("ok");
		}
		
		if(h3.a == 2.0f && h3.b == 6.5f && h3.c == 4.2f && h3.d == 0.0f &&
			h3.e == 0.0f && h3.f == 0.0f && h3.g == 0.0f) { 
			System.out.println("ok");
		}
	}
}