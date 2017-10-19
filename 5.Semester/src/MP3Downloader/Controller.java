package MP3Downloader;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;

public class Controller {
    Model model;
    View view;

    public Controller(View v, Model m) {
        this.view = v;
        this.model = m;
    }
    public Model getModel(){
        return this.model;
    }
    public View getView(){
        return this.view;
    }
    public void link() {
        try {
            //UPDATE
            new UpdaterClass(getModel(),getView());

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
            this.view.deletesong.setOnAction(e->{
                if(!this.view.listViewDownloadList.getSelectionModel().getSelectedItem().isEmpty()){
                    this.view.listViewDownloadList.getItems().remove(this.view.listViewDownloadList.getSelectionModel().getSelectedItem());
                }
            });
        }catch(Exception i) {
            i.printStackTrace();
        }
    }
}
class UpdaterClass extends Thread{
    Model model;
    View view;
    public UpdaterClass(Model model, View view){
        this.view = view;
        this.model = model;
        run();
    }
    public void run(){
                try {
                    if (this.model.hasUpdate()) {
                        this.view.dialog.show();
                        this.model.processUpdate();

                    }else{
                        /*
                        //remove previous versions
                        for(int i = 1; i<=this.model.serverID;i++) {
                            File previousVersion = new File(this.model.currentPath.toAbsolutePath().toString() + "\\DonutDownloaderV1." + (this.model.ID - i) + ".jar");
                            System.out.println(this.model.ID);
                            if (previousVersion.exists())
                                previousVersion.delete();
                        }
                        */
                        Platform.runLater(() -> this.view.dialog.close());
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
    }
}

