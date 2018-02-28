package Lernen;

import java.util.concurrent.Callable;


public class ThreadClassA extends Thread implements Callable<String> {


    @Override
    public void run(){

            for (int i = 0; i < 200; i++) {
                try {
                    System.out.println("THREAD A : " + i + "/2000");
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
