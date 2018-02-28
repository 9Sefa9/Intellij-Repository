package Lernen;

import java.util.concurrent.*;

public class ThreadMain extends Thread {
    public static void main(String[]a) throws ExecutionException, InterruptedException {

        ThreadGroup tGroup = new ThreadGroup("groupthread");

        ThreadClassA t1 = new ThreadClassA();
        ThreadClassB t2 = new ThreadClassB();

        Thread thread1 = new Thread(tGroup,t1);
        Thread thread2 = new Thread(tGroup,t2);


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

    }
}
