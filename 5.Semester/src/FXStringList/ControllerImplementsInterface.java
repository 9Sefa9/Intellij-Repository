package FXStringList;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControllerImplementsInterface implements EventHandler<ActionEvent> {

	private Model model;
	private View view;

	public void link(Model model, View view) {
		this.model = model;
		this.view = view;
		view.getList().setItems(model.getStrings());
		view.addEventHandler(this);
	}
	@Override
	public void handle(ActionEvent event) {
		model.addString(view.getInputPaneText());
	}
}
