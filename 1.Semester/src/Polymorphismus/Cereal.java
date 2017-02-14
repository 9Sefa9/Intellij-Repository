package Polymorphismus;
public class Cereal extends Product {

	private double weight;

	public Cereal(int id, String name, double price, double weight) {
		super(id, name, price);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mein Id ist " + id + ". Ich heisse " + name
				+ ". Ich koste " + price + " Euro und wiege " + weight
				+ " Gramm.";

	}
}
