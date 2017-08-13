package Algorithms;

import org.jetbrains.annotations.NotNull;

/**
 * Splitsort Algorithm
 */
public class Splitsort<type extends Comparable<? super type>> {

    private int firsthalf,secondhalf;
    /**
     * Splits the list in pieces
     */
    public void split(type[] list) {
        firsthalf = list.length / 2;
        secondhalf = list.length / 2;

        while (secondhalf - 1 >= 0 && secondhalf < list.length) {

            if ((list[secondhalf].compareTo(list[secondhalf - 1]) ) < 0 && secondhalf > 0) {
                swap(list, secondhalf, secondhalf - 1);

                if (secondhalf < list.length / 2)
                    secondhalf += 1;

                continue;
            } else if ((list[secondhalf].compareTo(list[secondhalf - 1]))>= 0 && secondhalf > 0) {
                secondhalf -= 1;
                continue;
            }
            break;
        }
        while (firsthalf < list.length && firsthalf >= 0) {
            //abbruchbedingung
            if (firsthalf + 1 == list.length) {
                break;
            } else if ((list[firsthalf].compareTo(list[firsthalf + 1]) ) >0 && firsthalf < list.length - 1) {
                swap(list, firsthalf, firsthalf + 1);

                if (firsthalf > 0)
                    firsthalf -= 1;

                continue;
            } else if ((list[firsthalf].compareTo(list[firsthalf + 1])) <= 0 && firsthalf < list.length - 1) {
                firsthalf += 1;
                continue;
            }
            break;
        }
    }
    public void swap(Comparable[] l,int i, int k){
        Comparable temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }
}
