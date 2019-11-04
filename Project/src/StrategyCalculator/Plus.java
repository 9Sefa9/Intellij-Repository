package StrategyCalculator;

/**
 * Created by hegemann on 17.10.17.
 */
public class Plus implements ICalc {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
