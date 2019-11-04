package SortStrategies;

public class Quicksort implements Sortable {
    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) // find item on left to swap
                if (i == hi) break;
            while (less(a[lo], a[--j]))	// find item on reight to swap
                if (j == lo) break;
            if (i >= j)	 break;	// check if ponters cross
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }
    public void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public boolean less(Comparable u, Comparable w){

        return u.compareTo(w)<0;
    }
    public void exch(Comparable []a, int i, int j){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
