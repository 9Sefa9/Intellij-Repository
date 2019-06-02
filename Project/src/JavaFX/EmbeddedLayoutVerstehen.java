package JavaFX;
import javafx.scene.*;
import javafx.application.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EmbeddedLayoutVerstehen extends Application {
    public static void main(String[] args){
            launch(args);
    }


    @Override
    public void start(Stage primaryStage){

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);


        Button b = new Button();


        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
