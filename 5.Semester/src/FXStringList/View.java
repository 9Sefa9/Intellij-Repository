import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class View extends BorderPane {

	private SimpleStringProperty buttonText = new SimpleStringProperty("Enter");
	private Button button = new Button();
	private TextField input = new TextField();

	private ListView<String> list = new ListView<String>();

	public View() {
		HBox box = new HBox(input, button);
		setCenter(list);
		setBottom(box);

		// Beispiel für ein einfaches Binding ---> ändert sich die Property, so
		// ändert sich auch die Beschriftung des Buttons
		button.textProperty().bind(buttonText);

		// Nur nötig, wenn das Aussehen einer Zelle geändert werden soll (z.B:
		// "Element: " + text + "...")
		// (hilfreich für die Übungen)
		// Hier die Lösung ohne Lambda Ausdrücke über eine neue Klasse
		// "MyCustomCell"
		Callback<ListView<String>, ListCell<String>> cb = new Callback<ListView<String>, ListCell<String>>() {
			@Override
			public ListCell<String> call(ListView<String> param) {
				return new MyCustomCell();
			}
		};
		list.setCellFactory(cb);

		// Nur nötig, wenn das Aussehen einer Zelle geändert werden soll (z.B:
		// "Element: " + text + "...")
		// (hilfreich für die Übungen)
		// Hier die Lösung mit Lamdba Ausdrücken, es entfällt eine neue Klasse
		// "MyCustomCell"
		buttonText.set("Enter Hallo");
//		list.setCellFactory(c -> {
//
//			ListCell<String> cell = new ListCell<String>() {
//				@Override
//				protected void updateItem(String myObject, boolean b) {
//					super.updateItem(myObject, myObject == null || b);
//					if (myObject != null) {
//						setText("Element: " + myObject + "...");
//					} else {
//						// wichtig da sonst der text stehen bleibt!
//						setText("");
//					}
//				}
//
//			};
//			return cell;
//
//		});
	}

	public void addEventHandler(EventHandler<ActionEvent> eventHandler) {
		button.addEventHandler(ActionEvent.ACTION, eventHandler);
	}

	public ListView<String> getList() {
		return list;
	}

	public String getInputPaneText() {
		return input.getText();
	}

}
