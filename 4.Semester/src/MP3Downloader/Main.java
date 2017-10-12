package MP3Downloader;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
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
        primaryStage.getIcons().add(new Image("MP3Downloader/Donuts.png"));
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> Platform.exit());
    }
}
