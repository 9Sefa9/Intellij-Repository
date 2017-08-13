package Algorithms;

/**
 * Splitsort Algorithm
 */
public class Splitsort<T> {
    private int[] list;
    private int l,firsthalf,secondhalf;

    public Splitsort(int[] list){
        this.list = list;
    }
    /**
     * Splits the list in pieces
     */
    public void split() {
        firsthalf = list.length / 2;
        secondhalf = list.length / 2;

        while (secondhalf - 1 >= 0 && secondhalf < list.length) {

            if ((this.list[secondhalf] < this.list[secondhalf - 1]) && secondhalf > 0) {
                swap(list, secondhalf, secondhalf - 1);

                if (secondhalf < list.length / 2)
                    secondhalf += 1;

                continue;
            } else if ((this.list[secondhalf] >= this.list[secondhalf - 1]) && secondhalf > 0) {
                secondhalf -= 1;
                continue;
            }
            break;
        }
        while (firsthalf < list.length && firsthalf >= 0) {
            //abbruchbedingung
            if (firsthalf + 1 == list.length) {
                break;
            } else if ((this.list[firsthalf] > this.list[firsthalf + 1]) && firsthalf < list.length - 1) {
                swap(list, firsthalf, firsthalf + 1);

                if (firsthalf > 0)
                    firsthalf -= 1;

                continue;
            } else if ((this.list[firsthalf] <= this.list[firsthalf + 1]) && firsthalf < list.length - 1) {
                firsthalf += 1;
                continue;
            }
            break;
        }
    }
    public void swap(int[] l,int i, int k){
        int temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }
}
