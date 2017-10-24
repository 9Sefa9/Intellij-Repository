public class Main {

	public static void main(String[] args) {

		System.out.println("First context (iterativ strat)");
		FibonacciComputation c = new FibonacciComputation(
				new FibonnaciIterative());
		System.out.println("Solution: " + c.execute(15));

		System.out.println("Second context (recursive strat)");
		c.setStrat(new FibonnaciRecursive());

		System.out.println("Solution: " + c.execute(15));
	}

}
