package MP3Downloader;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Model{

    private View view;
    private DirectoryChooser dirChooser;
    private File fileSave;
    private String choosenPath = new String();
    private ListView<String> downloadList,convertList;
    public ObservableList<String> urllist;
    private ExecutorService exec;
    private ArrayList<CompletableFuture<String>> temp;

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
        this.downloadList = downloadList;
        this.convertList = convertList;
        if (this.choosenPath != null && !this.choosenPath.equals("")) {

            for(String url:this.urllist){
                this.downloadList.getItems().add("Downloading "+url);
                this.convertList.getItems().remove(url);
            }

            new innerProcessClass(this.choosenPath,this.urllist,downloadList,convertList).start();
            this.urllist = FXCollections.observableArrayList();


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

    public void replaceTitleWith(String defaultTitle,String titleFromView){
        File oldF,newF;
        try{
            oldF = new File(this.choosenPath+"/"+defaultTitle+".mp3");
            newF =  new File(this.choosenPath+"/"+titleFromView+".mp3");
            if(oldF.exists()){
                oldF.renameTo(newF);
            }
            else{
                throw new Exception("Could not change name!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class innerProcessClass extends Thread{
        private ObservableList<String> urllist;
        private ListView<String> convertList,downloadList;
        private String choosenPath;

    public innerProcessClass(String path,ObservableList<String> urllist,ListView<String> downloadList,ListView<String> convertList){
        this.urllist = urllist;
        this.convertList = convertList;
        this.downloadList = downloadList;
        this.choosenPath = path;
    }
    @Override
    public void run(){
       ArrayList<CompletableFuture<String>> temp = new ArrayList<>();

       for(String youtubeUrl: this.urllist){

            System.out.println("Thread gestartet!");
            temp.add(CompletableFuture.supplyAsync(new MP3(youtubeUrl,this.choosenPath)));

        }
        //musste so hässlig sein, weil er irgendwas mit not fx thread labert...
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < temp.size(); j++) {
                    try {
                        downloadList.getItems().remove(j);
                        downloadList.getItems().add(""+temp.get(j).get());
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });


    }
}