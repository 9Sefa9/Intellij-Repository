package JavaFX;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/* The main window corresponds to a Stage,
which contains a Scene,
which contains a scene graph.
The scene graph is a tree of UI nodes.
 */
//stage: bühne
//scene: die Szene(was im fenster drinne sein soll)
//layout: vorlage
//parent: anorndung der Buttons etc.auf richtige weise
public class FensterVorlage extends Application{
    public static void main (String [] args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        //SceneGraph, notwendig für stage!
        //ist sowohl notwendig für UI´s
        VBox parent = new VBox();

        //label, Text ausgabe im Fenster
        Label label = new Label("Ich Bin Ein Label");

        //Scene, übergibt den Parent
        Scene scene = new Scene(parent);
        parent.getChildren().add(label);

        //erstellt einen ButtonLearningn
        Button button = new Button();
        button.setText("Ein Knopf");
        parent.getChildren().add(button);

        //TextField: erstellt textfelder
        TextField textfield = new TextField();
        textfield.setText("textfeld");
        parent.getChildren().add(textfield);

        //Slider, recht simple zu verstehen
        Slider slider = new Slider();
        parent.getChildren().add(slider);

        //textArea:
        TextArea textarea = new TextArea();
        textarea.setText("TextArea");
        parent.getChildren().add(textarea);

        stage.setScene(scene);

        stage.show();
    }


}

