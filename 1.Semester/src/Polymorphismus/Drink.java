package Polymorphismus;
public class Drink extends Product {

	private double volume;

	public Drink(int id, String name, double price, double volume) {
		super(id, name, price);
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Mein Id ist " + id + ". Ich heiße " + name
				+ ". Ich koste " + price + " Euro und mein Volumen ist "
				+ volume + " Liter.";

	}

}
