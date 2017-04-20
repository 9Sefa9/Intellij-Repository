package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AllLightsOn extends Application {
    Button buttons[];
    BorderPane root;
    GridPane grid;
    VBox vbox;
    Scene scene;
    Text yellowText;
    Text blueText;
    int yellowValue,blueValue;

    public static void main(String[] ar) {
        launch(ar);


    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();
        grid = new GridPane();
        vbox = new VBox();
        blueText = new Text();
        yellowText = new Text();
        yellowValue = 0;
        blueValue = 0;
        scene = new Scene(root, 600, 500);

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


       //resetet das spiel
        resetGame();

        vbox.setAlignment(Pos.CENTER_RIGHT);
        vbox.getChildren().addAll(yellowText,blueText);
        root.setLeft(grid);
        root.setCenter(vbox);


        primaryStage.setScene(scene);
        primaryStage.show();

    }

    //nimmt die buttons entgegen.
    public void onClick(int i) {

        changeColor(buttons[i]);

        if (i % 5 != 4) {
            changeColor(buttons[i + 1]);
            countBlueAndYellowButtons(buttons[i + 1]);
        }
            if (i % 5 != 0) {
                changeColor(buttons[i - 1]);
                countBlueAndYellowButtons(buttons[i - 1]);
            }
        if (i / 5 != 4) {
            changeColor((buttons[i + 5]));
            countBlueAndYellowButtons(buttons[i +5]);
        }
        if (i / 5 != 0) {
            changeColor(buttons[i - 5]);
            countBlueAndYellowButtons(buttons[i - 5]);
        }
    }

    public void changeColor(Button button) {
        String style = button.getStyle().equals("-fx-base:blue") ? "-fx-base:yellow" : "-fx-base:blue";
        button.setStyle(style);

    }

    public void resetGame(Button[] reset){
        for(Button b: reset)
        b.setStyle("-fx-base:blue");
    }
    public void resetGame(){
        Button r = new Button();
        r.setText("RESET");
        r.setMinSize(100,50);
        vbox.getChildren().addAll(r);
        r.setOnAction(e ->{resetGame(buttons);});
    }
    public void countBlueAndYellowButtons(Button b){
        for (int i = 0; i < 25; i++) {
            blueValue = b.getStyle().equals("-fx-base:blue") ? blueValue++ : yellowValue--;
            yellowValue = b.getStyle().equals("-fx-base:yellow") ? yellowValue++ : blueValue--;

            blueText.setText("" + blueValue);
            yellowText.setText("" + yellowValue);
        }
        }

}
