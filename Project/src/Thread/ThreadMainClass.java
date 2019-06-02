package Thread;

import SortStrategies.Mergesort;
import java.util.ArrayList;
import java.util.concurrent.*;

//Kapitel: Threads
public class ThreadMainClass {
    public static void main(String[] ar) throws ExecutionException, InterruptedException {
       Callable();
     //  completableFuture();
    }
    public synchronized static void  Callable() throws ExecutionException, InterruptedException {
        Comparable[] array = new Comparable[1000];
        for(int i = 0;i<array.length;i++)
            array[i] =(int)Math.round(Math.random() * (100000 - 0)+0);

        ExecutorService exec = Executors.newCachedThreadPool();
        Future<Comparable[]> f2 = exec.submit((Callable<Comparable[]>)new Mergesort(array));

        Comparable[] newArr = f2.get();

        for(int i = 0; i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
        exec.shutdown();
    }
    /*public  static  void completableFuture() throws ExecutionException, InterruptedException {
        Comparable[] array = new Comparable[1000];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) Math.round(Math.random() * (100000 - 0) + 0);

        //with ArrayList
        ArrayList<CompletableFuture<Comparable[]>> ccc = new ArrayList<>();
        ccc.add(CompletableFuture.supplyAsync(new Mergesort(array)));

        //without ArrayList
        CompletableFuture<Comparable[]> ccc2 = unnötig zu initialisieren aber egal.. new CompletableFuture<>();
        ccc2 = CompletableFuture.supplyAsync(new Mergesort(array));
        Comparable[] newList = ccc2.get();
        System.out.println("*+++++++++++++++++++++++++" + newList[newList.length - 1]);

    }*/
}
