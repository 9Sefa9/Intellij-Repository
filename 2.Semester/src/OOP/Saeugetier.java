package OOP;

public class Saeugetier {
	private int alter = 0; // in Tagen
	private int hunger = 100; // in Prozent
	private boolean lebendig = true;

	public int getAlter() {
		return alter;
	}

	public void altern() {
		if (!lebendig)
			return;
		alter++;
		hunger += 10;
		if (hunger > 150 || alter > lebenserwartung()) {
			sterben();
		}
	}

	public void saeugen() {
		if (lebendig && hunger > 0) {
			hunger--;
		}
	}

	public int lebenserwartung() {
		return 5;
	}

	public void sterben() {
		System.out.println("R.I.P.");
		lebendig = false;
	}
}