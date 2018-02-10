package FXStringList;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class View extends BorderPane {

	private SimpleStringProperty buttonText = new SimpleStringProperty("");

	public String getButtonText() {
		return buttonText.get();
	}

	public SimpleStringProperty buttonTextProperty() {
		return buttonText;
	}

	public Button getButton() {
		return button;
	}

	public TextField getInput() {
		return input;
	}

	public Button button = new Button();
	private TextField input = new TextField();
    private ComboBox<String> combo = new ComboBox<>();
	private ListView<String> list = new ListView<String>();

	public View() {
		HBox box = new HBox(input, button);
		setTop(combo);
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
		list.setCellFactory(c -> {

			ListCell<String> cell = new ListCell<String>() {
				@Override
				protected void updateItem(String myObject, boolean b) {
					super.updateItem(myObject, myObject == null || b);
					if (myObject != null) {
						setText("Element: " + myObject + "...");
					} else {
						// wichtig da sonst der text stehen bleibt!
						setText("");
					}
				}

			};
			return cell;

		});
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

	public ComboBox<String> getCombo() {
		return combo;
	}

	public void setCombo(ComboBox<String> combo) {
		this.combo = combo;
	}
}
