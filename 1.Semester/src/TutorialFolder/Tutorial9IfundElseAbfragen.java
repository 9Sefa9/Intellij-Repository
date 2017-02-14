package TutorialFolder;
import java.util.Scanner;
public class Tutorial9IfundElseAbfragen {

	public static void main(String[] args) {
		int alter;										// = bedeuted eine Zuweisung!
		Scanner tippen =new Scanner(System.in);
		
		
		System.out.println("Wie alt bist du ?: ");	
		alter = tippen.nextInt();						// da es sich um eine Ganzzahl handelt: 
		
		
		if(alter<16)
		{
		  System.out.println("kein alkohol für dich !");	
		}
								
		else if(alter==16){		// == ist für eine Abfrage notwendig! Ist das Alter wirklich 16 ?
			System.out.println("Nur bier und wein! für dich!");
		}
		else if(alter==17){
			System.out.println("du kommst hier nicht rein!");			
		}
		else{					//hier kommt alles, wenn die bedingung nicht erfüllt ist
			System.out.println("fühl dich freiw ie ein Vogel!");
		}
		
	}

}
