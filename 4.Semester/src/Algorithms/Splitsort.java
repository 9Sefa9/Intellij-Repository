package Algorithms;

import java.util.ArrayList;

/**
 * Splitsort Algorithm
 */
public class Splitsort {
    private int[] list;
    private int l,firsthalf,secondhalf;

    public Splitsort(int[] list){

        this.list = list;


    }
    /**
     * Splits the list in pieces
     */
    public void split() {
        firsthalf =  list.length/2;
        secondhalf=  list.length/2;

        while (((secondhalf - 1) >= 0)) {

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
    public void alternateSplitSort(){
        firsthalf  =  list.length/2;
        secondhalf =  list.length/2;

        while ((secondhalf % list.length)!=0) {

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
        while ((firsthalf % list.length) != 0) {
            if (this.list[firsthalf] == this.list[firsthalf + 1]) {
                firsthalf += 1;
                continue;
            }
            if (this.list[firsthalf] <= this.list[firsthalf + 1]) {
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
    }

    public void swap(int[] l,int i, int k){
        int temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }
}
