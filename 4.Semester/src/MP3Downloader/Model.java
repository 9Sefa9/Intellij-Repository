package MP3Downloader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Model {

    private View view;
    private DirectoryChooser dirChooser;
    private File fileSave;
    private String choosenPath = new String();
    public ObservableList<String> urllist;

    public Model(View view) throws Exception {

        //mp3 initialisierung... eventuell mit Thread um eventuell ladezeiten zu vermeiden
        urllist = FXCollections.observableArrayList();
        this.view = view;
    }

   //attached to add to mp3 list

    public void setUrlToList(String url, ListView<String> downloadList) {

        if (!url.isEmpty() && url.startsWith("https://www.youtube")) {
            try {

                for(int i = 0; i<downloadList.getItems().size(); i++){
                    if(downloadList.getItems().get(i).equals(url)){
                        return;
                    }
                }


                this.urllist.add(url);
                downloadList.getItems().add(url);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void processDownloadFromList(ListView<String> convertList, ListView<String> downloadList){

        if (this.choosenPath != null && !this.choosenPath.equals("")) {

            for(String youtubeUrl: this.urllist){

                    MP3 mp3 = new MP3(this.view,youtubeUrl,this.choosenPath);
                    Thread t =new Thread(mp3);
                    t.start();

                    downloadList.getItems().add("Downloading...");
                    convertList.getItems().remove(youtubeUrl);

                System.out.println("Start Thread Nr."+t.getId());
            }

               this.urllist = FXCollections.observableArrayList();
              //  convertList.getItems().remove(0,convertList.getItems().size());

        } else {
            savePath();
            processDownloadFromList(convertList, downloadList);
        }
    }
    //attached to paste
    public void ctrlv(TextField urlfield) {
        urlfield.setText(null);
        urlfield.paste();


        if (!urlfield.getText().startsWith("https://www.youtube")) {
            urlfield.setText(null);
            urlfield.setStyle("-fx-prompt-text-fill: red");
            urlfield.setPromptText("Copied URL is not a valid Youtube link !");
        }
    }
    //attached to save path
    public void savePath() {
    try {
        dirChooser = new DirectoryChooser();

        //zeigt den "save" Fenster

        fileSave = dirChooser.showDialog(new Stage());
        //solange fenster offen
        if (fileSave != null) {
            //speichere den Ordner ab
            this.choosenPath = fileSave.getAbsolutePath();
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

}
    //attached to save path as well
    public void openSavepathExplorer(){
        try {
            Runtime.getRuntime().exec("explorer.exe " + this.choosenPath);
        }catch(IOException i){
            i.printStackTrace();
        }

    }


}
class innerClass extends Thread{

    private ListView<String> convertList,downloadList;
    private ThreadGroup group;
    private ObservableList<String> urllist;

    public innerClass(ListView<String> convertList,ListView<String> downloadList,ObservableList<String> urllist){
    this.convertList = convertList;
    this.downloadList = downloadList;
    this.urllist = urllist;
    }

    @Override
    public void run(){
        while(true) {
            if (group.activeCount() <= 0) {
                downloadList.getItems().remove(0, downloadList.getItems().size());
                for (String youtubeUrl : this.urllist) {
                    // downloadList.getItems().get(downloadList.getItems().indexOf(youtubeUrl)).replace(youtubeUrl, "Done!");
                    downloadList.getItems().add("DONE!");
                }
                break;
            }
        }
    }

}
