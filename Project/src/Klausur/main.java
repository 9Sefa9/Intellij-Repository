package Klausur;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage primaryStage){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();
        controller.link(model,view);

        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
