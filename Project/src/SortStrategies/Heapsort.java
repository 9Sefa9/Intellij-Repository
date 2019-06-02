package SortStrategies;

public class Heapsort implements Sortable {
    public void sort(Comparable[] a) {
        int N = a.length;

        for (int k = N / 2; k >= 1; k--)
            sink(a, k, N);

        while (N > 1) {
            exch(a, 1, N);
            sink(a, 1, --N);
        }
    }
    public void sink(Comparable[] a, int k, int N) {
        while (2 * k <= N) {
            // linkes kind
            int j = 2 * k;
            // wenn linkes kind kleiner als rechtes kind, erhöhe linkes kind
            if (j < N && less(a, j, j + 1))
                j++;
            // wenn k nicht kleiner sein sollte als linkes kind --> break;
            if (!less(a,k, j))
                break;
            // vertausche k mit linkes kind
            exch(a, k, j);
            k = j;
        }
    }


    @Override
    public void exch(Comparable[] pq, int i, int j) {
        Comparable swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

    public boolean less(Comparable[] pq, int i, int j) {
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    @Override
    public boolean less(Comparable v, Comparable w) { return false; }
}
