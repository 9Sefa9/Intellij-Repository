package FXStringList;

import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;

public class ControllerWithLambda {

	public void link(Model model, View view) {
		//Verbidung zwischen den Daten im Model und der Liste in der View.
		//Die Liste wird automatisch über Änderungen informiert und aktualisiert sich.
		view.getList().setItems(model.getStrings());

		//Seit Java 1.8 können Lambda-Ausdrücke verwendet werden.
		//Da EventHandler ein funktionales Interface ist (besitzt nur eine Methodensignatur),
		//kann hier elegant mit Lambda-Ausdrüken gearbeitet werden.
		view.addEventHandler(f -> {
			model.addString(view.getInputPaneText());
		});
	}

}
