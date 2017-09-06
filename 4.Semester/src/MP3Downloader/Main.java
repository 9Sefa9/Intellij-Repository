package MP3Downloader;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        View view = new View();
        Scene scene = new Scene(view);
        Model model = new Model(view);
        Controller controller = new Controller(view,model);
        controller.link();

        primaryStage.setTitle("MP3Downloader v1.0");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> Platform.exit());
    }
}
