package JavaFX;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class closeProgramProperly extends Application{

    Stage window;
    Button button;
    StackPane layout;
    @Override
    public void start(Stage primaryStage){
    window = primaryStage;

    window.setMinHeight(200);
    window.setMinWidth(300);
    window.setTitle("How To Close Program better!");
    window.show();


    }
}
