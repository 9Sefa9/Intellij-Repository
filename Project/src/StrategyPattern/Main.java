package StrategyPattern;

public class Main {

	public static void main(String[] args) {

		FibonnaciBaseStrat fbs = new FibonnaciIterative();
		System.out.println(fbs.computeFibonacci(20));
	}

}
