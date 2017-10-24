package StrategyPatternBasis;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		
		ArrayList<BaseStrat> list = new ArrayList<>();
		
		list.add(new StratA()); 
		list.add(new StratB());
				
		list.get(0).textOut("Test");
		list.get(1).textOut("Test");
		
		
	}

}
