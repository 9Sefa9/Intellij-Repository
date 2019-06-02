package StrategyCalculator;

/**
 * Created by hegemann on 17.10.17.
 */
public class MainCalculator {

    public static void main(String[] args) {
        ICalc calc = new Plus();
        System.out.println("Plus "+calc.calculate(7,5));
        calc = new Minus();
        System.out.println("Minus "+calc.calculate(7,5));
    }
}
