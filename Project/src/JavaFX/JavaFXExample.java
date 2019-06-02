import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stackPane = new StackPane();
		Node labelNode = new Label("Hello World in JavaFX!");
		stackPane.getChildren().add(labelNode);

		primaryStage.setScene(new Scene(stackPane, 250, 75));
		primaryStage.setTitle("JavaFX Example");
		primaryStage.setResizable(true);
		primaryStage.centerOnScreen();
		primaryStage.show();
	}

}
