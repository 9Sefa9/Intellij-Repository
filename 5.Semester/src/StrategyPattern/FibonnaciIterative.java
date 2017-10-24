//Concrete strategy which implements the interface FibonnaciBaseStrat
public class FibonnaciIterative implements FibonnaciBaseStrat {

	public int computeFibonacci(int a) {

		int fi = 1;
		int h_1 = 1;
		int h_2 = 1;
		if (a == 1 || a == 2) {
			System.out.println("Iterative computing... step: " + fi);
			return fi = 1;
		} else {
			for (int i = 3; i < a + 1; i++) {
				System.out.println("Iterative computing... step: " + (i - 2));
				fi = h_1 + h_2;
				h_2 = h_1;
				h_1 = fi;
			}
			return fi;
		}

	}

}
