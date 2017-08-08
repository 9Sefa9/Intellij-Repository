package Algorithms;

import java.util.ArrayList;

/**
 * Splitsort Algorithm
 */
public class Splitsort {

    private int[] list;
    public Splitsort(int[] list){
        this.list = list;
    }
    /**
     * Splits the list in pieces
     */
    public void split() {
        int l = list.length - 1;
        int firsthalf = l / list.length;
        int secondhalf = l / list.length;

        while (((secondhalf - 1) > 0)) {

            if (this.list[secondhalf] == this.list[secondhalf - 1]) {
                secondhalf -= 1;
                continue;
            }
            if (this.list[secondhalf] < this.list[secondhalf - 1]) {
                swap(list, secondhalf, secondhalf - 1);
                secondhalf -= 1;
                continue;
            }
            if (this.list[secondhalf] > this.list[secondhalf - 1]) {
                secondhalf -= 1;
                continue;
            }

        }

            while ((firsthalf + 1) < list.length) {

                if (this.list[firsthalf] == this.list[firsthalf + 1]) {
                    firsthalf += 1;
                    continue;
                }
                if (this.list[firsthalf] < this.list[firsthalf + 1]) {
                    firsthalf += 1;
                    continue;
                }
                if (this.list[firsthalf] > this.list[firsthalf + 1]) {
                    swap(list, firsthalf, firsthalf+1);
                    firsthalf += 1;
                    continue;
                }
                firsthalf += 1;
            }

            /*
                        1, 4, 2, 3,   7   , 6, 8, 9, 10,5
                                      ij

            */

    }
    public void swap(int[] l,int i, int k){
        int temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }
}
