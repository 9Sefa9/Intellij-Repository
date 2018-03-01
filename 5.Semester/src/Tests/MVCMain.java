package Tests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MVCMain extends Application {

    @Override
    public void start(Stage primaryStage){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();
        controller.link(model,view);

        primaryStage.setScene(new Scene(view));
        primaryStage.setMaxHeight(200);
        primaryStage.setMaxWidth(200);
        primaryStage.show();

    }
}
