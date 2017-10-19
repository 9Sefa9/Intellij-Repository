package Thread;

import SortStrategies.Mergesort;
import SortStrategies.Sortable;
import org.apache.bcel.verifier.structurals.GenericArray;
import sun.reflect.annotation.ExceptionProxy;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.concurrent.*;

//Kapitel: Threads
public class ThreadMainClass {
    public static void main(String[] ar) {
        ThreadGroup group = new ThreadGroup("Group1");
        Thread t = new Thread(group, new ThreadImplements());
        t.start();

        Thread te = new Thread(group, new ThreadExtends());
        te.start();

        try {
            while (group.activeCount() > 0) {
                System.out.println("Warte:");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized static void  future1(){
        Comparable[] array = new Comparable[1000];
        for(int i = 0;i<array.length;i++)
            array[i] =(int)Math.round(Math.random() * (100000 - 0)+0);

        ExecutorService exec = Executors.newCachedThreadPool();
        Future<Comparable[]>[] f = new Future[1];

      //  f[0] = exec.submit(new Mergesort(array));
        for(int i = 0;i<f.length; i++){
            try {
                System.out.println(f[i].get());
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        exec.shutdown();
    }
    public void completableFuture(){
        Comparable[] array = new Comparable[1000];
        ArrayList<CompletableFuture<Comparable[]>> ccc = new ArrayList<>();
        for(int i = 0;i<array.length;i++)
            array[i] =(int)Math.round(Math.random() * (100000 - 0)+0);

        Mergesort s = new Mergesort(array);
        // ccc.add(CompletableFuture.supplyAsync(s));

        for(int i = 0; i<ccc.size();i++){
            System.out.println(ccc.get(i));
        }
    }
}
