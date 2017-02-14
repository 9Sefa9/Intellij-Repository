package ‹bung;

public class SuperAufruf‹bung extends SuperDieSuperKlasse {
	
	private int test;
	
	public SuperAufruf‹bung(int geschwindigkeit){
		super(2,4);
		this.test = geschwindigkeit;
	}
	public String toString(){
		return super.toString()+test;
	}
}
