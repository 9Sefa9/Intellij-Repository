package FXStringList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControllerWithoutLambda {

	//Bis einschliesslich Java 1.7 müsste Model final sein, da es in der annonymen Klasse verwenden wird.
	public void link(Model model, View view) {
		view.getList().setItems(model.getStrings());
		//Bis einschliesslich Java 1.7 mussten anomyme innere Klassen benutzt werden.
		view.addEventHandler(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				model.addString(view.getInputPaneText());
			}
		});
	}

}
