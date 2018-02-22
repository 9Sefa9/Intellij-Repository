package WaitNotify;

import java.util.ArrayList;

public class ClassA extends Thread{
    private ArrayList<String> nameList;
    public ClassA(ArrayList<String> nameList){
        this.nameList = nameList;
    }
    @Override
    public void run (){
        while(true) {
        synchronized (nameList){

                try {
                    System.out.println(Thread.currentThread().getName()+" hat ein Job für dich ! NOTIFY WORKER");
                    nameList.add("Arbeit");
                    nameList.notify();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
