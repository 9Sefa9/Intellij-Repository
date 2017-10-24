//Concrete strategy which implements the interface FibonnaciBaseStrat
public class FibonnaciRecursive implements FibonnaciBaseStrat {

	static int count = 0;

	public int computeFibonacci(int a) {
		count++;
		System.out.println("Recursive computing... step: " + count);
		if (a == 1 || a == 2) {
			return 1;
		} else {
			return computeFibonacci(a - 1) + computeFibonacci(a - 2);
		}
	}

}
