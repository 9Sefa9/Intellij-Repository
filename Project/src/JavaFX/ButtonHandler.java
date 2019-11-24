package JavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;


public class ButtonHandler extends Application{
    Button button;
    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ButtonLearningn Behaviour");

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout,200,200);

        button = new Button();
        button.setText("Klick Mich");

        button.setOnAction((event) -> {button.setText("Geklickt!");});

        layout.getChildren().add(button);

        primaryStage.setScene((scene));
        primaryStage.show();
    }

}
