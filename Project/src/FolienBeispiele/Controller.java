package FolienBeispiele;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller() {

    }

    /**
     * Reads the data from the view and adds it to the model.
     */
    public void actionPerformed(ActionEvent arg0) {
        model.addString(view.getInputPaneText());
        System.out.println("actionPerformed in controller");
    }

    public void link(Model m, View v){

        this.model = m;
        // register Model.java
        this.model.addObserver(v);

        //Linkt action listener
        this.view = v;
        System.out.println("added action listener to contorller himslef");
        view.addActionListener(this);

    }

}