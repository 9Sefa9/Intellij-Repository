package Chatin;

import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class View extends BorderPane {
    VBox vb;
    ListView<String> lv;
    TextField textfield;
    TextArea textarea,userarea;
    public View(){
        vb = new VBox();

        textarea = new TextArea();
        vb.getChildren().add(textarea);

        textfield = new TextField();
        vb.getChildren().add(textfield);

        lv = new ListView<>();
        lv.setMaxSize(140,180);
        lv.setLayoutX(10);
        vb.setPrefWidth(150);
        lv.setPrefWidth(500);
        setLeft(vb);
        setRight(lv);
    }

}
