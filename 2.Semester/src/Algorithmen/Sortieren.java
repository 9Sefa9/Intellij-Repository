import java.util.Scanner;

public class Sortieren {
	static Scanner scanner = new Scanner(System.in);

	private static void Sort (int a, int b, int c){
		
		if (a > b && a > c && b > c){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		if (a > b && a > c && c > b){
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		
		if (b > a && b > c && a > c){
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		
		if (b > a && b > c && c > a){
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		
		if (c > a && c > b && a > b){
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		
		if (c > a && c > b && b > a){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}	
	}

	public static void main(String[] args) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		do {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
		
			if (a >= 1000 || b >= 1000 || c >= 1000 || a<=0 || b<=0 || c<=0){
				System.out.println("Bitte geben sie nur Zahlen zwischen 0 und 1000 ein!");
			}else{
				Sort(a,b,c);
			}			
		}while ((a && b && c) == 0);
	}
}	

			
