package diverseTest;

import java.util.Scanner;

public class helloWorldDiverseTests {	
	
	//main methode 
	public static void main(String[] args) {
		
		Scanner eingabe =  new Scanner(System.in);
		
		System.out.println("Willkommen!");
		System.out.println("1.Spiel Starten");
		System.out.println("2.Spiel beenden");
		
		System.out.println("bitte wählen sie ihre entscheidung !: ");
		int userinput = eingabe.nextInt();
		int userinput2 = eingabe.nextInt();
		
		
		
		if(userinput == userinput2){
			userinput += userinput2;    // userinput = userinput + userinput2
			System.out.println("das spiel beginnt. = "+userinput);
			
		}else if(userinput == 0){
			
			System.out.println("das Spiel wurde beendet!");
			
		}else{
			System.out.println("Fehler ! das spiel wurde beendet! ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String daswasicheingebe = eingabe.nextLine();							  //eingabe.nextDouble() .nextFloat()  .nextInt   .nextString(-->nextLine()
		
		
		System.out.println(daswasicheingebe);
		*/
		
		
	}
	
}
