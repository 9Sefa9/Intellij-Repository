package Lernen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonLearningn extends Application {
    private JButton jbutton = new JButton();
    private Button b  = new Button();

    private Pane pane;
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage primaryStage){
            pane = new Pane();
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();
        pane.getChildren().addAll(b);
        addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>(){
            @Override
                    public void handle(ActionEvent event){
            }
        });
        b.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {

            }
        });

    }
    public void addEventHandler(EventType<ActionEvent> action, EventHandler<ActionEvent> event){
        this.b.addEventHandler(action,event);
    }
    public void addActionListener(ActionListener listener){
        this.jbutton.addActionListener(listener);
    }
}
