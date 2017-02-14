package GPT;
import java.lang.ArrayIndexOutOfBoundsException;

public class ExceptionAufgabe {

	public static void main(String[] args) {
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a + " % " + b + " = " + a % b);
		System.out.println("Ende");
		}catch(ArrayIndexOutOfBoundsException a){
			a.printStackTrace();
			System.out.println("Ende");
		}catch(ArithmeticException a){
			a.printStackTrace();
			System.out.println("Ende");
		}
		catch(NumberFormatException n){
			n.printStackTrace();
			System.out.println("Ende");
			}

	}
}
