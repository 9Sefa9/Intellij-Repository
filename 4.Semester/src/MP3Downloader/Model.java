package MP3Downloader;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class Model {

    private DirectoryChooser dirChooser;
    private File fileSave;
    private String choosenPath = new String();
    private ArrayList<String> urllist;

    public Model() throws Exception {

        //mp3 initialisierung... eventuell mit Thread um eventuell ladezeiten zu vermeiden
        urllist = new ArrayList<>();

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
    /*

            for (int i = 0; i <= convertList.getItems().size(); i++) {
                //if(downloadList.getItems().get(i).equals(convertList.getItems().get(i)) && downloadList.getItems().get(i)!= null){
                //    return;
                // }
                if(downloadList.getItems().get(i) != null)
                downloadList.getItems().add(convertList.getItems().get(i));
            }
    */
        if (this.choosenPath != null && !this.choosenPath.equals("")) {

            for(int i = 0; i< convertList.getItems().size();i++) {

                downloadList.getItems().add(convertList.getItems().get(i));
            }

            int k  = 0;
            File f = null;
            for(String url: this.urllist){

                    f = new File(this.choosenPath + "/" + "musik" + k + ".mp3");

                    while (f.exists()) {
                        k++;
                        f = new File(this.choosenPath + "/" + "musik" + k + ".mp3");
                    }

                    MP3 mp3 = new MP3(this,url, this.choosenPath, "musik" + k + ".mp3");

                    Thread t =new Thread(mp3);
                    t.start();
                    System.out.println("Start Thread Nr."+t.getId());
            }


               this.urllist = new ArrayList<>();
                convertList.getItems().remove(0,convertList.getItems().size());

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
