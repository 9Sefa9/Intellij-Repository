package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class AllLightsOn extends Application {
    Button buttons[];
    BorderPane root;
    GridPane grid;
    Scene scene;

    public static void main(String[] ar) {
        launch(ar);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();
        grid = new GridPane();
        scene = new Scene(root, 500, 600);

        buttons = new Button[25];

        for (int i = 0; i < 25; i++) {
            final int j = i;
            buttons[i] = new Button();
            buttons[i].setStyle("-fx-base:blue");
            buttons[i].setMinSize(100, 100);

            //spalte        //zeile

            grid.add(buttons[i], i % 5, i / 5);
            buttons[i].setOnAction(e -> {onClick(j);});
        }

        root.setTop(grid);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void onClick(int i) {

        changeColor(buttons[i]);

        if (i % 5 != 4)
            changeColor(buttons[i + 1]);
        if (i % 5 != 0)
            changeColor(buttons[i - 1]);
        if (i / 5 != 4)
            changeColor((buttons[i + 5]));
        if (i / 5 != 0)
            changeColor(buttons[i - 5]);

        //   buttons[i].setOnAction(e -> {buttons[i].setStyle("-fx-base:yellow");


    }

    public void changeColor(Button button) {
        String style = button.getStyle().equals("-fx-base:blue") ? "-fx-base:yellow" : "-fx-base:blue";
        button.setStyle(style);
    }
}
