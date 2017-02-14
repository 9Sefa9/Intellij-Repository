package diverseTest;

public class Niki {
	private int Muskel;
	private int Knochen;
	public static void main(String[] args) {
		Niki EinMensch = new Niki(5);
		EinMensch.setMuskel(10);
		
		System.out.println(EinMensch);
	}
	public Niki(int test) {
		this(0,5);
	}
	public Niki(int test, int test2) {
		this.Muskel = test; 
		this.Knochen = test2;
	}
	public void setMuskel(int einMuskel){
		this.Muskel = einMuskel;
	}
	public int getMuskel(){
		return this.Muskel;
	}
	public String toString() {
		return "Anzahl an Muskeln : " + this.Muskel + "\nAnzahl an Knochen:  " + this.Knochen + "";
	}

}
