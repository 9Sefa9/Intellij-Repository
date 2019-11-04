package Lernen;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadMain extends Thread {
    public static void main(String[]a) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        ThreadGroup tGroup = new ThreadGroup("groupthread");
        Thread thread1 = new Thread(tGroup,new ThreadClassA(lock,lock2));
        Thread thread2 = new Thread(tGroup,new ThreadClassB(lock,lock2));

        thread1.start();
        thread2.start();
        /*
        //Thread A
        //thread1.start(); oder:
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<String> fObject = exec.submit((Callable<String>) new ThreadClassA());
        System.out.println(fObject.get());
        exec.shutdown();

        //Thread B
        //  thread2.start(); oder:
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(new ThreadClassB());
        System.out.println(cf.get());
        */
    }
}
