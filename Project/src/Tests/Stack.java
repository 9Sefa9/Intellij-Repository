package Tests;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void put() throws InterruptedException {
        while(!list.isEmpty()){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        list.add("*");
        list.add("*");
        list.add("*");
        list.add("*");
        printList();
        notify();

    }
    public synchronized void remove() throws InterruptedException {

        while(list.isEmpty()){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        list.remove(list.size()-1);
        printList();
        notify();
    }
    public synchronized void printList(){
        for(String i : this.list){
            System.out.print(i+"|");
        }
        System.out.print("\n---------------------------------------------\n");
    }
}
