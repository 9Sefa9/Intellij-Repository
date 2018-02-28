package SortStrategies;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Clocksort implements Sortable{
    private ArrayList<Comparable> subList = new ArrayList<>();

    @Override
    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }

    @Override
    public void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    @Override
    public void sort(Comparable[] a) {

        int first = 2;
        int second = (a.length/2)+2;
        Comparable<Integer> firstValue,secondValue;
        while(a.length>0){
            if(a.length == 1){
                this.subList.add(a[0]);
                break;
            }
            if(first == 0)
                first = 2;
            if(second == 0)
                second = (a.length)/2;

            if(less(a[first%a.length],a[(first+1)%a.length]) && less(a[first%a.length],a[first-1%a.length])){
                //mach was, nimm first
                firstValue = a[first%a.length];

            }else if(less(a[(first+1)%a.length],a[first-1%a.length])){
                // mach was nimm denn links bzw rechts stehenden
                firstValue = a[(first+1)%a.length];
                first +=1;
            }else{
                firstValue = a[first-1%a.length];
                first +=1;
            }

            if(less(a[second%a.length],a[(second+1)%a.length]) && less(a[second%a.length],a[second-1%a.length])){
                //mach was, nimm mitte
                secondValue = a[second%a.length];
            }else if(less(a[(second+1)%a.length],a[second-1%a.length])){
                //nimm denn links bzw rechts stehenden
                secondValue = a[(second+1)%a.length];
                second +=1;
            }else{
                secondValue = a[second-1%a.length];
                second -=1;
            }


            if(less(firstValue,secondValue)){
                    this.subList.add(firstValue);
                    a = ArrayUtils.remove(a, first);

                while(this.subList.size()-1>2) {
                    if(less(firstValue, this.subList.get(this.subList.indexOf(firstValue)-1))) {
                        Comparable<Integer> tmp = this.subList.get(this.subList.indexOf(firstValue)-1);
                        this.subList.remove(this.subList.get(this.subList.indexOf(firstValue)-1));
                        this.subList.add(tmp);
                    }
                }

            }else {
                    this.subList.add(secondValue);
                    a = ArrayUtils.remove(a, second);
               while(this.subList.size()-1>2){
                   if(less(secondValue, this.subList.get(this.subList.indexOf(secondValue)-1))) {
                       Comparable<Integer> tmp = this.subList.get(this.subList.indexOf(secondValue)-1);
                       this.subList.remove(this.subList.get(this.subList.indexOf(secondValue)-1));
                       this.subList.add(tmp);
                   }
               }
            }


            second%=a.length;
            first%=a.length;

        }
     for(Comparable i: this.subList){
            System.out.print(i+", ");
     }

    }
}
