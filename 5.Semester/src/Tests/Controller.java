package Tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view;
    private Model model;
    public void link(Model model, View view) {
        this.model = model;
        this.view = view;

        this.model.addObserver(view);
        this.view.addActionListener(this);
       // view.addEventHandler(e ->{
       //     model.liste.add(Integer.valueOf(view.getInput().getText()));
      //  });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.liste.add(Integer.valueOf(view.getInput().getText()));
    }
}
