package SortStrategies;

public interface Sortable {
     boolean less(Comparable v, Comparable w);
     void exch(Comparable[] a, int i, int j);
     void sort(Comparable[] a);
}
