package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;


public class AllLightsOn extends Application {
    private  Button buttons[];
    private BorderPane root;
    private GridPane grid;
    private VBox vbox;
    private Scene scene;
    private Text yellowText;
    private Text blueText;
    private int yellowValue,blueValue;

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

        scene = new Scene(root, 600, 500);

        buttons = new Button[25];

        blueText.setTextAlignment(TextAlignment.LEFT);
        yellowText.setTextAlignment(TextAlignment.LEFT);

        for (int i = 0; i < 25; i++) {
            final int j = i;
            buttons[i] = new Button();
            buttons[i].setStyle("-fx-base:blue");
            buttons[i].setMinSize(100, 100);

            //spalte        //zeile

            grid.add(buttons[i], i % 5, i / 5);
            buttons[i].setOnAction(e -> {onClick(j);});
            blueValue++;

            blueText.setText("BLUE: " + blueValue);
            yellowText.setText("YELLOW: " + yellowValue);
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

        }
            if (i % 5 != 0) {
                changeColor(buttons[i - 1]);

            }
        if (i / 5 != 4) {
            changeColor((buttons[i + 5]));

        }
        if (i / 5 != 0) {
            changeColor(buttons[i - 5]);

        }
    }

    public void changeColor(Button button) {
        String style = button.getStyle().equals("-fx-base:blue") ? "-fx-base:yellow" : "-fx-base:blue";
        if(style.equals("-fx-base:blue")) {
            blueValue++;
            yellowValue--;
        }
        else if(style.equals("-fx-base:yellow")){
            yellowValue++;
            blueValue--;
        }
        blueText.setText("BLUE: " + blueValue);
        yellowText.setText("YELLOW: " + yellowValue);
        button.setStyle(style);

    }

    public void resetGame(Button[] reset){

    }
    public void resetGame(){


        Button r = new Button();
        r.setText("RESET");
        r.setMinSize(100,50);
        vbox.getChildren().addAll(r);
        r.setOnAction(e ->{
            yellowValue = 0;
            blueValue = 25;

            blueText.setText("BLUE: " + blueValue);
            yellowText.setText("YELLOW: " + yellowValue);

            for(Button b: buttons)
            b.setStyle("-fx-base:blue");});

    }

}
