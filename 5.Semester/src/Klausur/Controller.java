package Klausur;
public class Controller {
    Model model;
    View view;
    public void link(Model model, View view){
        this.model = model;
        this.view = view;
        view.getList().setItems(model.list);
        view.addEventHandler(event-> {
            model.list.add(view.getInputText());
        });
    }
}
