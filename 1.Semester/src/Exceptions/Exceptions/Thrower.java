package Exceptions.Exceptions;
public class Thrower {

	public static void passDisc () throws FrisbeeNotCaught {
		
		throw new FrisbeeNotCaught();
	}
}
