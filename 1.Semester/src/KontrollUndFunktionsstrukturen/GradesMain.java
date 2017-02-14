package KontrollUndFunktionsstrukturen;
import java.util.Scanner;

public class GradesMain {
	
	/*
	 *  "wandelt" Zahlen von 0-100 in in das amerikanische Notensystem um, wobei nur eine if-Verzweigung verwendet wurde.
		Es wurde keine extra Methode erstellt, sondern die Implementierung fand in der main-Methode statt 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		double score;
		
		System.out.println("Enter a numerical score between 0-100.");
		score =scan.nextDouble();
		
		
		if (score >=0 && score <=100) {
		
		
			System.out.println("The grade is ");
		
			if (score >=90.0d) {
			System.out.println("A");
			
			}else if (score >=85.0d){
			System.out.println("B");
			
			} else if (score >=80.0d) {
			System.out.println("B-");
			
			} else if (score >=75.0d) {
			System.out.println("C");
			
			} else if (score >=70d) {
			System.out.println("C-");
			
			} else if (score >=65.0d) {
			System.out.println("D");
			
			} else if (score >=60.0d) {
			System.out.println("D-");
			
			} else {
			System.out.println("F");
			
			}
		
		} else {
			System.out.println("Nope");
		}
		
	}

}
