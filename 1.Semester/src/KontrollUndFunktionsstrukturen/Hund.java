package KontrollUndFunktionsstrukturen;

public class Hund extends Säugetier {
	private int alter;

	public int getAlter() {
		return alter;
	}

	public void alter() {
		alter++;
	}
	public String bellen(){
		return "Wuff";
	}
}
