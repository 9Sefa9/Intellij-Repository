package TutorialFolder;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) 
	{
		int y;
		int x;
		int z;
		Scanner eingabe = new Scanner(System.in);
		x =eingabe.nextInt();
		y =eingabe.nextInt();
		z =eingabe.nextInt();
		int [] array = new int[x];
		array[y] = z;
		System.out.println("spruckt was aus: "+array[y]);
		System.out.println("methode:");
		arrayTest2();
		

}
	public static void arrayTest2(){
		int x;
		int y;
		int z;
		
		Scanner eingabe = new Scanner(System.in);
		x=eingabe.nextInt();
		y=eingabe.nextInt();
		z=eingabe.nextInt();
		
		int [] direktinitialisierung ={x,y,z};
	
		for(int i:direktinitialisierung){
		System.out.println("Die Zahlen von x ,y z, : "+i);
		}
	}
}
