package Lernen;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;

public class ThreadClassB extends Thread implements Supplier<String>{
    private Lock lock,lock2;
    public ThreadClassB(Lock lock, Lock lock2){
       this.lock=lock;
        this.lock2=lock2;
    }
    @Override
    public void run(){

            synchronized (this) {
                for (int i = 0; i < 150; i++) {
                    try {
                        System.out.println("THREAD B : " + i + "/150");
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
    @Override
    public String get() {
        Thread t = new Thread(this);
        t.start();
        try {
            t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return "Thread B is done! ";
    }
}
