package Exceptions.Exceptions;
import java.util.Scanner;

public class InputConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input[] = new String[5]; // erstellt 5 elemente 
		for (int i = 0; i < input.length; i++) {
		input[i] = sc.nextLine();       // einzelne Elemente werden eingetippt ( bis zu 5)
		}

		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			try { // summiere die zaheln die in dem String vorkommen ! 
				sum += Integer.parseInt(input[i]); // summiert die zahl in einem String array zusammen zu sum.
			} catch (NumberFormatException e) {    // falls sich buchstaben drinne befinden, dann  fehlermeldung ausgeben!
				System.err.println("Fehler " + e.getMessage());
			}finally{
				System.out.println("Summe: " + sum);
			}
		}
		
	}
}
