package SortStrategies;

public class Pathsort implements Sortable {

    @Override
    public void sort(Comparable[] a) {







    }

    @Override
    public boolean less(Comparable v, Comparable w) {
        return false;
    }

    @Override
    public void exch(Comparable[] l,int i, int k){
        Comparable temp = l[i];
        l[i] = l[k];
        l[k] = temp;
    }


}
