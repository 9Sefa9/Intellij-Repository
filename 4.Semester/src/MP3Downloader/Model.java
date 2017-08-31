package MP3Downloader;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Model {

    private DirectoryChooser dirChooser;
    private FileChooser fileChooser;
    private File file,fileSave;
    private Path path;
    private String choosenPath;

    //attached to paste
    public void ctrlv(TextField urlfield){
        urlfield.setText(null);
        urlfield.paste();

        if(!urlfield.getText().startsWith("https://www.youtube")) {
            urlfield.setText(null);
            urlfield.setPromptText("Copied URL is not a valid Youtube link !");
        }
    }
    public void setUrlToList(String url,ListView<String> downloadList){
        if(!url.isEmpty() && url != null && url.startsWith("https://www.youtube"))
          downloadList.getItems().add(url);
    }
    public void savePath(){
            try{
                fileChooser = new FileChooser();

                //zeigt ein bevorzugtes format an , nämlich *.pl
             //   FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("*.pl", ".pl");
             //   fileChooser.getExtensionFilters().add(extFilter);

                //zeigt den "save" Fenster
                fileSave =fileChooser.showSaveDialog(new Stage());

                if(fileSave != null)
                    fileChooser.getInitialDirectory().getPath();
             //   fileChooser.setTitle("Saving incoming MP3's in" +fileSave.getPath());

                //solange fenster offen
                if(fileSave!=null)
                    //speichere die Dateien mit dem extension "*.mp3" in path
                    this.choosenPath = fileSave.getPath();
            }
            catch(Exception e) {
                e.printStackTrace();
            }

    }

}
