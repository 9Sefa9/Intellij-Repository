package Tests;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View extends BorderPane implements Observer{
    private Button button = new Button();
    private JButton jbutton = new JButton();
    private TextField input = new TextField();
    private ListView<Integer> list = new ListView<Integer>();
    public View(){
        HBox hbox = new HBox(getInput(),button);
        setCenter(getList());
        setBottom(hbox);
        button.setText("Enter");
    }
    public Button getButton(){
        return this.button;
    }
    public void setButton(Button button){
        this.button=button;
    }
    public void addEventHandler(EventHandler<ActionEvent> event){
        this.button.addEventHandler(ActionEvent.ACTION,event);
    }

    public ListView<Integer> getList() {
        return list;
    }

    public void setList(ListView<Integer> list) {
        this.list = list;
    }

    public TextField getInput() {
        return input;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("o: "+o);
        System.out.println("arg: "+arg);
    }
    public void addActionListener(ActionListener listener){
        this.jbutton.addActionListener(listener);
    }

}
