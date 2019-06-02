package Lernen;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;


public class ThreadClassA extends Thread implements Callable<String> {

    private Lock lock,lock2;
    public ThreadClassA(Lock lock, Lock lock2){
        this.lock=lock;
        this.lock2=lock2;
    }
    @Override
    public void run(){
       synchronized (this) {

           for (int i = 0; i < 150; i++) {
               try {
                   System.out.println("THREAD A : " + i + "/150");
                   sleep(50);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
        }
    @Override
    public String call() throws Exception {
        Thread t = new Thread(this);
        t.start();
        t.join();
        return "Thread A is done! ";
    }
}
