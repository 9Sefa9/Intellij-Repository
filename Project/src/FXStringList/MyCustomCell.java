package FXStringList;

import javafx.scene.control.ListCell;

public class MyCustomCell extends ListCell<String> {

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

}