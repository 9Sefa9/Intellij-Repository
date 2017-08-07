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
    public void split(){
        int l = list.length-1;
        int firsthalf = l/2;
        int secondhalf = l/2;

        while(!((secondhalf-1)<0)){

            if(this.list[secondhalf] == this.list[secondhalf-1]){
                secondhalf-=1;
            }
            if (this.list[secondhalf]<this.list[secondhalf-1]){
                secondhalf-=1;

            }
            if (this.list[secondhalf]<this.list[secondhalf-1]){
                    swap(list,firsthalf+1,secondhalf);
                    secondhalf-=1;
                    continue;
                }
                secondhalf-=1;
            }


        while((firsthalf+1) < list.length){

            if(this.list[firsthalf] == this.list[firsthalf+1]){
                firsthalf+=1;

            }
            if (this.list[firsthalf]<this.list[firsthalf+1]){
                firsthalf = firsthalf+1;

            }
            if (this.list[firsthalf]>this.list[firsthalf+1]){

                    swap(list,firsthalf+1,secondhalf);
                    firsthalf+=1;
                    continue;
                }
                firsthalf+=1;
            }

            /*      8  3  6  4   9   1  6  3  8  5
                                 ij

                    8  3  6  4    1    9  6  3  8  5
                             j         i

                    8  3  6  4    1    9  6  3  8  5
                          j               i

                    8  3  3  4    1    8  6  6  8  5
                    j                              i


            */

    }
    public void swap(int[] l,int i, int k){
        int temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }
}
