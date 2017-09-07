package MP3Downloader;

import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    Model model;
    View view;

    public Controller(View v, Model m) {
        this.view = v;
        this.model = m;
    }

    public void link() {
        try {

            this.view.paste.setOnAction(e -> this.model.ctrlv(this.view.insertUrl));
            this.view.convert.setOnAction(e -> this.model.setUrlToList(this.view.insertUrl.getText(), this.view.listViewConvertList));
            this.view.download.setOnAction(e -> this.model.savePath());
            this.view.addsongs.setOnAction(e -> this.model.processDownloadFromList(this.view.listViewConvertList, this.view.listViewDownloadList));
            this.view.goToPath.setOnAction(e -> this.model.openSavepathExplorer());
            this.view.listViewDownloadList.setOnMouseClicked(event -> {
                this.view.title.setText(this.view.listViewDownloadList.getSelectionModel().getSelectedItem());
            });
            this.view.title.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    if(!view.listViewDownloadList.getSelectionModel().isEmpty() && !view.listViewDownloadList.getSelectionModel().getSelectedItem().startsWith("Downloading")) {
                        String defaultTitle = view.listViewDownloadList.getSelectionModel().getSelectedItem();
                        view.listViewDownloadList.getItems().remove(view.listViewDownloadList.getSelectionModel().getSelectedItem());
                        view.listViewDownloadList.getItems().add(view.title.getText());

                        model.replaceTitleWith(defaultTitle,view.title.getText());
                    }else System.out.println("nothing to change..");
                }
            }
        });
           //TODO: delet ebutton implementieren, dafr sorgen, das sie uas der Festplatte gelscöht wird...
            this.view.deletesong.setOnAction(e->{
                if(!this.view.listViewDownloadList.getSelectionModel().getSelectedItem().isEmpty()){
                    this.view.listViewDownloadList.getItems().remove(this.view.listViewDownloadList.getSelectionModel().getSelectedItem());
                }
            });

        }catch(Exception e){
                e.printStackTrace();
        }

    }
}

