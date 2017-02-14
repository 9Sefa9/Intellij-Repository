package OOP;

public class Tiere {
	public static void main(String[] args) {
		Saeugetier fido = new Hund();
		Saeugetier cindy = new Katze();
		System.out.println("Das Alter von fido ist " + fido.getAlter());//Saeugetier
		System.out.println("Fido macht " + ((Hund) fido).bellen());    //casting from Saeugetier to Hund , hund = new hund
		cindy.altern(); 
		System.out.println("Cindy ist jetzt "+((Katze) cindy).mauzen()); //casting from Saeugetier to katze,  katze = new Katze
		System.out.println("Cindy: "+ cindy.lebenserwartung());
	}
}