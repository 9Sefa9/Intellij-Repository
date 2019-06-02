package Tests;

import java.util.ArrayList;

public class Remover extends Thread{
    private Stack stack;
    public Remover(Stack stack){
        this.stack=stack;
    }
    @Override
    public void run(){
        for(int i = 0; i<150; i++){
            try{
                stack.remove();
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
