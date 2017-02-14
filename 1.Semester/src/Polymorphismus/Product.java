package Polymorphismus;
public abstract class Product {

	protected int id;
	protected String name;
	protected double price;
	// konstruktor!
	
	public Product(int id, String namze, double price) {
		this.id = id;
		this.name = namze;
		this.price = price;
	}
	
	public void runPastScanner() {
		System.out.println("Strichcode von Produkt " + name + " wurde gescannt.");
	}
}
