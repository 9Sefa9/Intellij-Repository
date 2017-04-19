package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class AllLightsOn extends Application {
    Button buttons[];

    public static void main(String[] ar) {
       launch(ar);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();
        Scene s = new Scene(root, 500, 600);

        buttons = new Button[25];
        for (int i = 0; i < 25; i++) {
            buttons[i] = new Button();
            buttons[i].setStyle("-fx-base:blue");
            buttons[i].setMinSize(100, 100);

            //spalte        //zeile
            grid.add(buttons[i], i % 5, i / 5);

        }
        root.setTop(grid);
        primaryStage.setScene(s);
        primaryStage.show();

    }


}
