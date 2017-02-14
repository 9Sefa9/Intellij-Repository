package Streams;
import java.util.Scanner;
public class StreamTutorialMenue extends Streams {

	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		
		
		System.out.println("\tWillkommen zur Stream Tutorial !\tBitte wählen sie einer der folgenden möglichkeiten! ");
		System.out.println("1.Buffered Writer");
		System.out.println("2.Buffered Reader");
		System.out.println("3.File");
		System.out.println("4.PrintWriter");
		System.out.println("5.File Input Stream");
		System.out.println("6.Buffered Input Stream");
		System.out.println("7.To Lower / upper Case");
		System.out.println("8.Kleine zusammenfassung");
		System.out.print(":>> ");
		int zahl = eingabe.nextInt();
		
		switch(zahl){
		case 1: DerBufferedFileWriter();
		break;
		case 2: DerBufferedFileReader();
		break;
		case 3: DieFileMethode();
		break;
		case 4: DerBufferedPrintWriterBruch();
		break;
		case 5: DerFileInputStream();
		break;
		case 6: DerBufferedInputStream();
		break;
		case 7: SuperGeileZusammenfassung();
		break;
		default: return;
		}
	}
}
