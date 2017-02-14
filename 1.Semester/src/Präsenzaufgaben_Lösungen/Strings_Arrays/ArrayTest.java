package Präsenzaufgaben_Lösungen.Strings_Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = { 2, 7,};
		System.out.println("Methode 2:\t" + methodeZwei(a));
		System.out.println("Methode 3:\t" + methodeDrei(a));
		System.out.println("Methode 4:\t" + methodeVier(a));
		System.out.println("Methode 5:\t" + methodeFuenf(a));
		
		
		int[] b= {1,2,3,2,1};
		System.out.println("Methode 6:\t" + methodeSechs(a,b));
		int[] c = methodeSieben(b);
		System.out.print("Methode 7:\t");
		for(int i: c)
			System.out.print(i + "\t");
		System.out.print("\n");
		
		
		String[] array = { "Anna", "anna", "Benjamin", "Horst", "Alex" };
		System.out.println("Methode 8:\t\t" + methodeAcht(array));
		String[] array2 = {"Ada", "Rolf", "Tim", "Ida", "Ado", "Dan"};
		System.out.println("Methode 9:\t\t" + methodeNeun(array2));
	}

	// gibt die grösste Zahl eines Arrays aus
	public static int methodeZwei(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	// summiert alle Elemente eines Arrays
	public static int methodeDrei(int[] array) {
		int sum = 0;
		for (int i : array)
			sum += i;
		return sum;
	}

	// summiert nur gerade Elemente eines Arrays
	public static int methodeVier(int[] array) {
		int sum = 0;
		for (int i : array) { // ungerade zahlen haben immer ein rest ! 7 geteilt durch 2 = 6, rest 1 !!!
			if (i % 2 == 0)
				sum += i;
			/* if(i % 2 == 0)
            {
            System.out.println("Die Zahl ist gerade!");
        }
            else{
               System.out.println("Die Zahl ist nicht gerade");
            }*/
		}
		return sum;
	}

	// multipliziert nur jedes zweite Element eines Arrays
	public static int methodeFuenf(int[] array) {
		int product = 1;
		for (int i = 1; i < array.length; i += 2)   
			product *= array[i]; // 1* array0 = product.  erhähe i mit  i+2 also den zweit nächsten element.
		// iteration(i+=2) wird nur ausgeführt, wenn die schleife fertig ist und von vorne anfängt!
		return product;
	}

	// gibt das Kreuzprodukt von zwei Arrays aus, wenn sie die gleiche Länge haben
	public static int methodeSechs(int[] a, int[] b) {
		if (a.length != b.length)
			return 0;

		int dotProduct = 0;
		for (int i = 0; i < a.length; i++)
			dotProduct += a[i] * b[i];
		return dotProduct;
	}

	// kopiert ein Array und erhöht jedes Element um 1
	public static int[] methodeSieben(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i] + 1;
		}
		return copy;
}

	// gibt die Anzahl der Strings in einem Array zurück, die mit „A“ beginnen

	public static int methodeAcht(String[] array) {
	int count = 0;
	for (String s : array) {
		if (s.startsWith("A"))
			++count;
	}
	return count;
}

	// gibt die Anzahl der Strings in einem Array zurück, die aus genau 3 Zeichen bestehen und deren zweites Zeichen ein „d“ ist.

	public static int methodeNeun(String[] array) {
	int count = 0;
	for (int i = 0; i < array.length; i++) {
		if (array[i].length() == 3 && array[i].charAt(1) == 'd')
			++count;
	}
	return count;
	}

}
