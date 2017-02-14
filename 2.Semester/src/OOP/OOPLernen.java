package OOP;

public class OOPLernen {

	private int a;
	private int b;

	public OOPLernen() {
		
	}
	public String toString(){
		return "Die summe von: "+getA()+"+"+getB()+"="+(getA()+getB())+"";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
