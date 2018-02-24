package Algorithms;

import SortStrategies.Clocksort;
import SortStrategies.Sortable;
import SortStrategies.Midsort;

public class Main {
    public  static  void  main(String[] args) throws InterruptedException {
        Comparable[] test ={4,10,20,0,21,22,5,6,3,17};
        Comparable[] test2 = {20,18,50,7, 3, 4, 2, 9, 10, 8, 6, 5, 0, 8, 2, 11, 6, 12, 15, 14, 100, 20, 28, 29, 21, 60, 30, 50, 0, 7, 78,266};
        Sortable s = new Clocksort();
               s.sort(test2);

               Thread.sleep(1000);

    }
}
