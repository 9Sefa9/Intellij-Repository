package JavaFX;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.application.Application;

public class CommunicatingBetweenWindows extends Application{
    public static void main(String[] args){
        launch(args);
    }
    static  boolean answer;
    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
    window = primaryStage;
    window.setMaxHeight(350);
    window.setMaxWidth(350);
    window.setTitle("How To Close Program better!");

    StackPane sp = new StackPane();
    Scene scene = new Scene(sp);

    button = new Button();
    button.setOnAction(e -> System.out.println(popupwindow()));
    sp.getChildren().add(button);

    window.setScene(scene);
    window.show();

    }
    //man könnte eventuell auch eine neue Klasse erstellen für den 2.window
    //ist aber zu test zwecken erstmal nicht nötig.
    public static boolean popupwindow() {

        Stage window2 = new Stage();
        window2.initModality(Modality.APPLICATION_MODAL);
        window2.setTitle("Ein Title");
        window2.setMinWidth(250);
        Label label = new Label();
        label.setText("Ein Label");

        //Create two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        //Clicking will set answer and close window
        yesButton.setOnAction(e -> {
            answer = true;
            window2.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window2.close();
        });

        VBox layout = new VBox(10);

        //Add buttons
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window2.setScene(scene);
        window2.showAndWait();

        //Make sure to return answer
        return answer;
    }
}
