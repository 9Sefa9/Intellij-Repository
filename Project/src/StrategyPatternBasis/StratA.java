package StrategyPatternBasis;

public class StratA implements BaseStrat{

	@Override
	public void textOut(String text) {
		System.out.println(text + " " + "A");
	}

	
}
