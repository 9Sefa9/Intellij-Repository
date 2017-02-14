
import java.io.IOException;
import java.util.Scanner;

public class SkypeStart {

	public static void main(String[] args) {
		int i;
		i = 0;
		String pfadEingabe = "";
		Scanner eingabe = new Scanner(System.in);

		System.out.println("Bitte pfad mit dem Exe eingeben!: ");
		pfadEingabe = eingabe.nextLine();

		try {
				
				Process p = new ProcessBuilder(pfadEingabe).start();
//				if(System.currentTimeMillis() == 10000.){
//					p.destroy();
//				}
				System.out.println(System.currentTimeMillis()*1000);
			

		}

		catch (Exception e) {
			System.out.println("Fehler! hier ist die Diagnose: ");
			e.printStackTrace();
		}

	}
}
