import java.util.Scanner;
public class JavaRechner {

	public static void main(String[] args){
		
		double zahl1;
		double zahl2;
		
		Scanner eingabe = new Scanner (System.in);
		
		System.out.println("zwei zahlen eingeben.");
		zahl1 = eingabe.nextDouble();
		zahl2 = eingabe.nextDouble();
		System.out.println("Addition:> "+addiere(zahl1, zahl2));
		System.out.println("Subtraktion:> "+subtrahiere(zahl1, zahl2));
		System.out.println("Multiplikation:> "+multipliziere(zahl1, zahl2));
		System.out.println("Division:> "+dividiere(zahl1, zahl2));
		System.out.println("Division mit Rest:> "+dividiereMitRest(zahl1, zahl2));
		System.out.println("Potenz:> "+potenziere(zahl1, zahl2));
	}
	public static double addiere(double zahl1, double zahl2){
		
		return zahl1+zahl2;
	}
	
	public static double subtrahiere(double zahl1, double zahl2){
		return zahl1-zahl2;
	}
	public static double dividiere(double zahl1, double zahl2){
		return zahl1/zahl2;
	}
	public static double dividiereMitRest(double zahl1, double zahl2){
		return zahl1%zahl2;
	}
	public static double multipliziere(double zahl1, double zahl2){
		return zahl1*zahl2;
	}
	public static double potenziere(double zahl1, double zahl2){
		return Math.pow(zahl1, zahl2);
	}
}
