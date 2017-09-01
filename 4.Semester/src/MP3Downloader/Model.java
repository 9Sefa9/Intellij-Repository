package MP3Downloader;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Model {

    private DirectoryChooser dirChooser;
    private File fileSave;
    private String choosenPath = new String();
    private MP3 mp3Library;

    public Model(){

        //mp3 initialisierung... eventuell mit Thread arbeiten
    }
    //attached to paste
    public void ctrlv(TextField urlfield){
        urlfield.setText(null);
        urlfield.paste();


        if(!urlfield.getText().startsWith("https://www.youtube")) {
            urlfield.setText(null);
            urlfield.setStyle("-fx-prompt-text-fill: red");
            urlfield.setPromptText("Copied URL is not a valid Youtube link !");
        }
    }
    public void setUrlToList(String url,ListView<String> downloadList){
        if(!url.isEmpty() && url.startsWith("https://www.youtube"))
          downloadList.getItems().add(url);


    }
    public void savePath(){
            try{
                dirChooser = new DirectoryChooser();

                //zeigt ein bevorzugtes format an , nämlich *.pl
             //   FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("*.pl", ".pl");
             //   fileChooser.getExtensionFilters().add(extFilter);

                //zeigt den "save" Fenster

                fileSave =dirChooser.showDialog(new Stage());
                //solange fenster offen
                if(fileSave!=null) {
                    //speichere den Ordner ab
                    this.choosenPath = fileSave.getAbsolutePath();

                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }

    }
    public void processDownloadFromList(ListView<String> convertList, ListView<String> downloadList){
        if(this.choosenPath != null && !this.choosenPath.equals("")){
            for(int i = 0; i<convertList.getItems().size(); i++){
                downloadList.getItems().add(convertList.getItems().get(i));
            }
            mp3Library = new MP3("",this.choosenPath);
            // MP3 mp3library = new MP3("",this.savePath())

        }else{
            savePath();
            processDownloadFromList(convertList,downloadList);
        }
    }
    public void openSavepathExplorer(){
        try {
            Runtime.getRuntime().exec("explorer.exe " + this.choosenPath);
        }catch(IOException i){
            i.printStackTrace();
        }

    }

}
