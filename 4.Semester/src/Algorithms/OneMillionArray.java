package Algorithms;
import SortStrategies.*;

public class OneMillionArray {
    public static void main(String[] a){
        Comparable[] mil = new Comparable[100000];
        for(int i = 0; i<mil.length;i++){
           mil[i] = (int)Math.round(Math.random() * (1000000 - 0)+0); // Liefert Zahlen von 25 - 49
           // mil[i] = i+1;
        }

        Sortable s = new Splitsort();
        long eins = System.currentTimeMillis();
        s.sort(mil);
        long zwei = (System.currentTimeMillis() - eins) / 1000;
        System.out.println("Es hat: "+zwei+" sekunden gedauert um eine Liste mit der länge "+mil.length+" zu sortieren!");
        System.out.println();
        for(Comparable t:mil){
            System.out.println(t);
        }
    }

}
