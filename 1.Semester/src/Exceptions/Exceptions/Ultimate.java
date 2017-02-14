package Exceptions.Exceptions;
public class Ultimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Thrower.passDisc ();
		} catch (FrisbeeNotCaught e) {
			System.out.println("Hopefully, the receiver's teeth are okay.");
		}
	}

}
