package LernPaket;

public class UngeradeTeilerRekursion {

		public static void main(String[]args){
			java.util.Scanner eingabe = new java.util.Scanner(System.in);
			int zahl = eingabe.nextInt();
			System.out.println(ungeraderTeiler(zahl));
		}
		public static double ungeraderTeiler(int zahl){
			if((zahl %2) != 0) return zahl;

				return ungeraderTeiler(zahl/2);
		}
}
