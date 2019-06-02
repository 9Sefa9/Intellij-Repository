package Klausur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller{
    public void link(Model model,View view){
        view.getList().setItems(model.getNumbers());

        view.addEventHandler(e->{
            model.getNumbers().add(view.getInputText());
        });

    }

}
