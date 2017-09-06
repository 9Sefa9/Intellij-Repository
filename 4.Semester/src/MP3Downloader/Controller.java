package MP3Downloader;

import javafx.collections.ListChangeListener;

public class Controller {
    Model model;
    View view;
    public Controller(View v, Model m){
        this.view = v;
        this.model = m;
    }
    public void link(){
        try {

        this.view.paste.setOnAction(e -> this.model.ctrlv(this.view.insertUrl));
        this.view.convert.setOnAction(e -> this.model.setUrlToList(this.view.insertUrl.getText(),this.view.listViewConvertList));
        this.view.download.setOnAction(e -> this.model.savePath());
        this.view.addsongs.setOnAction(e -> this.model.processDownloadFromList(this.view.listViewConvertList,this.view.listViewDownloadList));
        this.view.goToPath.setOnAction(e->this.model.openSavepathExplorer());
        this.view.listViewDownloadList.setOnMouseClicked(event -> {
            this.view.title.setText(this.view.listViewDownloadList.getSelectionModel().getSelectedItem());
        });
        //TODO versuche den Titel zu ändern..  wahrscheinlich dann explorer greifend..

        this.view.listViewDownloadList.getSelectionModel()
        }catch(Exception e){
                e.printStackTrace();
        }

    }
    }

