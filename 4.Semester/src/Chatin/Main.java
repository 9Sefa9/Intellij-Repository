package Chatin;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Model model = new Model();
        View view  = new View();
        Controller controller = new Controller(model,view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        controller.link();

        primaryStage.setResizable(false);
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> Platform.exit());

    }
}
