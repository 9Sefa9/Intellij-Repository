package Tests;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;

public class Putter extends Thread {
    private Stack stack;
    public Putter(Stack stack){
        this.stack=stack;
    }

    @Override
    public void run(){
        for(int i = 0; i<150; i++){
            try{
                stack.put();
                Thread.sleep(10);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
