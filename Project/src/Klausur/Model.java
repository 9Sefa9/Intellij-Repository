package Klausur;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

    private ObservableList<Integer> numbers = FXCollections.observableArrayList();
    public ObservableList<Integer> getNumbers(){
        return this.numbers;
    }
}
