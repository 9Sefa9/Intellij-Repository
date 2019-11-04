package JavaFX;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GroupVerstehen extends Application {
    public static void main(String[] arg){
        launch(arg);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group g = new Group();
        Scene scene1 = new Scene(g,500,500);
        StackPane sp = new StackPane();

        Button test = new Button();
        test.setPadding(new Insets(20));
        test.setText("TEEST");

        g.getChildren().addAll(sp,test);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
