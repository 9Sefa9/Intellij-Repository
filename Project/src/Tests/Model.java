package Tests;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
   ArrayList<Integer> liste = new ArrayList<>();

   public ArrayList<Integer> getListe(){
       return this.liste;
   }
   public void setListe(ArrayList<Integer> liste){
       this.liste=liste;
       setChanged();
       notifyObservers();
   }
   public void add(int i){
       this.liste.add(i);
       setChanged();
       notifyObservers();
   }
}
