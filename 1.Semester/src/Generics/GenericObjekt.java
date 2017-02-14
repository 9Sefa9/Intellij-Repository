package Generics;

public class GenericObjekt {
	// brot wurst käse pizza --->klassen
	public static void main(String[] args) {
		Brot b1 = new Brot();
		Wurst w1 = new Wurst();
		Pizza p1 = new Pizza();
		Kaese k1 = new Kaese();
		// x y
		Pair<Brot, Wurst> wurstbrot = new Pair<Brot, Wurst>(b1, w1);
		Pair<Pizza, Kaese> kaesepizza = new Pair<Pizza, Kaese>(p1, k1);

		Brot b2 = wurstbrot.first(); // was ist first ? eine methode ? ja!
		Wurst w2 = wurstbrot.second();
		if (b1 == b2 && w1 == w2) {
			System.out.println("ok");

			Pizza p2 = kaesepizza.first();
			Kaese k2 = kaesepizza.second();
			if (p1 == p2 && k1 == k2) {
				System.out.println("ok");

			}

		}

	}

}
