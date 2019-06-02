package StrategyPattern;

// Execution module in which the concrete strategy can be changed in dependency of the context.
// This class is not necessary to realize the strategy pattern
public class FibonacciComputation {
 
	private FibonnaciBaseStrat strategy;
	
	public FibonacciComputation(FibonnaciBaseStrat strategy){
		this.strategy = strategy;
	}
	
	public void setStrat(FibonnaciBaseStrat strategy){
		this.strategy = strategy;
	}
	
	public int execute(int a){
		return this.strategy.computeFibonacci(a);
	}
}
