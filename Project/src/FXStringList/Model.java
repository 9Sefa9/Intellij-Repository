package FXStringList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

	// Beobachtbarer Datencontainer, der bei Ändeurngen die Beobachter
	// informiert.
	private ObservableList<String> strings = FXCollections.observableArrayList();

	public void addString(String s) {
		strings.add(s);
	}

	public ObservableList<String> getStrings() {
		return strings;
	}

}
