package FXStringList;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControllerImplementsInterface implements EventHandler<ActionEvent> {

	private Model model;
	private View view;

	public void link(Model model, View view) {
		this.model = model;
		this.view = view;
		view.getList().setItems(model.getStrings());

	}
	@Override
	public void handle(ActionEvent event) {
		System.out.println("pressed");
		model.addString(view.getInputPaneText());
	}
}
