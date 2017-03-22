package JavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class ButtonHandler extends Application implements EventHandler<ActionEvent>{
    Button button;
    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Button Behaviour");

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout,200,200);

        button = new Button();
        button.setText("Klick Mich");

        //when ever they klick this button, the code that this handle this is in this class look in this class to find the handle method
        button.setOnAction(this);

        layout.getChildren().add(button);

        primaryStage.setScene((scene));
        primaryStage.show();
    }

    @Override
    //wird aufgerufen, sobald ein event stattfindet
    public void handle(ActionEvent event) {
        if(event.getSource() == button)
            System.out.println("ein Button wurde geklickt!");

    }
}
