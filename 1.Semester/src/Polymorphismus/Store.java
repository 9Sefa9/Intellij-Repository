package Polymorphismus;

public class Store {

	private Product[] products;

	public Store(Product[] products) {
		this.products = products;
	}

	public static void main(String[] args) {
		Drink d1 = new Drink(1, "Cola", 1.2, 0.5);
		Drink d2 = new Drink(2, "Fanta", 1.1, 0.5);
		Fruit f = new Fruit(3, "Apfel", 0.5, 3);
		Cereal c = new Cereal(4, "Rice Crispies", 2.5, 200);
		Product array[] = { d1, d2, f, c };
		Store s = new Store(array);
		s.printStore();
		
	}

	public void printStore() { // geht alle produkte durch
		for (Product p : products) {
			System.out.println(p);
			p.runPastScanner();
		}
	}

}
