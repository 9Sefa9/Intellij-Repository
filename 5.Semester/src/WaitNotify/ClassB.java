package WaitNotify;

import java.util.ArrayList;

public class ClassB extends Thread{
    private ArrayList<String> nameList;
    public ClassB(ArrayList<String> nameList){
        this.nameList = nameList;
    }

    @Override
    public void run (){
        while(true) {
            synchronized (nameList) {
                //worker kann nur ab 5 arbeitsauftärgen anfangen zu arbeiten!
                while (nameList.size() < 1) {
                    try {
                        nameList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("WORKER hat gearbeitet!");
                nameList.remove(nameList.size()-1);
            }
        }
    }
}
