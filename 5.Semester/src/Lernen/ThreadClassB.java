package Lernen;

import java.util.function.Supplier;

public class ThreadClassB extends Thread implements Supplier<String>{

    @Override
    public void run(){

            for (int i = 0; i < 200; i++) {
                try {
                    System.out.println("THREAD B : " + i + "/2000");
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
