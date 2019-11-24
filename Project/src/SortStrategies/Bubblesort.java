package SortStrategies;

public class Bubblesort implements Sortable {

    public void sort(Comparable[] a){
        boolean done;
        do{
            done = true;
            for(int i=1; i<a.length; i++){
                if(a[i-1].compareTo(a[i])>0){
                    Comparable temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                    done = false;
                }
            }
        }
        while(!done);
    }
    @Override
    public boolean less(Comparable v, Comparable w) {
        return false;
    }

    @Override
    public void exch(Comparable[] a, int i, int j) {

    }

}
