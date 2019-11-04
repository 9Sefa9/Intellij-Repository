package Klausur;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

//bereits gegeben
public class View extends BorderPane implements Observer{
    private Button button = new Button();
    private TextField input = new TextField();
    private ListView<Integer> list = new ListView<Integer>();
    private ComboBox<Integer> cb = new ComboBox<>();
    public View(){
        HBox hbox = new HBox(input,button);
        setCenter(list);
        setBottom(hbox);
        button.setText("Enter");
    }
    public void addEventHandler(EventHandler<ActionEvent> event){
        button.addEventHandler(ActionEvent.ACTION,event);
    }
    public ListView<Integer> getList(){
          //  this.button.textProperty().bind(this.input.textProperty());
        return this.list;
    }
    public int getInputText(){

        return Integer.parseInt(input.getText());
    }

    @Override
    public void update(Observable o, Object arg) {
        list.getItems().add((int)arg);
    }
}
